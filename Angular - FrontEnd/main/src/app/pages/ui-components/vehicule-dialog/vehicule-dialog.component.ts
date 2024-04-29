import { ChangeDetectorRef, Component, EventEmitter, OnInit, Output } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Owner } from 'src/app/models/owner.model';
import { Vehicle } from 'src/app/models/vehicle.model';
import { RadarsService } from 'src/app/services/radars/radars.service';

@Component({
  selector: 'app-vehicule-dialog',
  templateUrl: './vehicule-dialog.component.html',
  styleUrls: ['./vehicule-dialog.component.scss']
})
export class VehiculeDialogComponent implements OnInit {
  private savedVehicle!: Object;
  private savedOwner!: Object;
  @Output() dataSaved: EventEmitter<void> = new EventEmitter<void>();
  constructor(private router: Router, private radarService: RadarsService, private formBuilder: FormBuilder, private cdr: ChangeDetectorRef) {
 
  }



  ngOnInit(): void {
    
    this.initFormBuilder();
  }

  public newVehicleForm!: FormGroup;
  saveNewVehicle() {
    let vehicleRegNumber = this.newVehicleForm.get("regNumber")?.value;
    let vehicleBrand = this.newVehicleForm.get("brand")?.value;
    let vehicleFiscalPower = this.newVehicleForm.get("fiscalPower")?.value;
    let vehicleModel = this.newVehicleForm.get("model")?.value;
    let vehicleOwnerName = this.newVehicleForm.get("ownerName")?.value;
    let vehicleOwnerBirthdate = this.newVehicleForm.get("ownerBirthdate")?.value;
    let vehicleOwnerEmail = this.newVehicleForm.get("ownerEmail")?.value;
       let vehicle = {
    "numMatricule": vehicleRegNumber,
    "marque": vehicleBrand,
    "puissanceFiscale": vehicleFiscalPower,
    "modele": vehicleModel,
  };
  let owner = {
      "nom": vehicleOwnerName,
      "dateNaissance": vehicleOwnerBirthdate,
      "email": vehicleOwnerEmail
  };

  this.radarService.saveVehicle(vehicle).subscribe({
    next: data => {
      this.savedVehicle = data;
      console.log("Saved Vehicle:", this.savedVehicle);
      
      // After saving the vehicle, save the owner
      this.radarService.saveOwner(owner).subscribe({
        next: data => {
          this.savedOwner = data;
          console.log("Saved Owner:", this.savedOwner);
          
          // After saving both vehicle and owner, add the vehicle to the owner
          this.radarService.addVehicleToOwner(this.savedVehicle, this.savedOwner).subscribe({
            next: data => {
              console.log("Vehicle added to owner:", data);
              // Emit the event to notify the parent component
              this.dataSaved.emit();
              // Trigger change detection
              this.cdr.detectChanges();
            },
            error: err => console.log(err)
          });
        },
        error: err => console.log(err)
      });
    },
    error: err => console.log(err)
  });
    this.dataSaved.emit();
    this.cdr.detectChanges();
  }


  private initFormBuilder() {
    this.newVehicleForm = this.formBuilder.group({
      regNumber: this.formBuilder.control('', [Validators.required]),
      brand: this.formBuilder.control('', [Validators.required]),
      fiscalPower: this.formBuilder.control('', [Validators.required]),
      model: this.formBuilder.control('', [Validators.required]),
      ownerName: this.formBuilder.control('', [Validators.required]),
      ownerBirthdate: this.formBuilder.control('', [Validators.required]),
      ownerEmail: this.formBuilder.control('', [Validators.required]),
    });
  }

}


