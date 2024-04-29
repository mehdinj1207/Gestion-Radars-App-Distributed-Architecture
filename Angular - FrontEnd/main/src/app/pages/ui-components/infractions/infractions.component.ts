import { HttpClient } from '@angular/common/http';
import { Component, TemplateRef, ViewChild } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MatDialog } from '@angular/material/dialog';
import { Router } from '@angular/router';
import { Infraction } from 'src/app/models/infraction.model';
import { Radar } from 'src/app/models/radar.model';
import { RadarsService } from 'src/app/services/radars/radars.service';

@Component({
  selector: 'app-infractions',
  templateUrl: './infractions.component.html',
  styleUrls: ['./infractions.component.scss']
})
export class InfractionsComponent {
  hidden=false;
  public infractions : Array<Infraction> = [];
  private radarById!: Object;
  private id:number;
  displayedColumns: string[] = ['id', 'date', 'vehiculeMatricule','vehicleSpeed', 'radarMaxSpeed', "fineAmount", 'consult', 'delete'];
  private savedInfraction!: Infraction;
  @ViewChild('deleteInfractionDialog') deleteInfractionDialog!: TemplateRef<any>;
  @ViewChild('addInfractionDialog') addInfractionDialog!: TemplateRef<any>;
  ngOnInit(): void {
    this.getInfractions();
    this.initFormBuilder();
    console.log("infraction",this.infractions)

  }
  toggleBadgeVisibility() {
    this.hidden = !this.hidden;
  }

  constructor(private router: Router, private radarService: RadarsService, private http: HttpClient, private formBuilder: FormBuilder, private dialog: MatDialog){

  }

  private getInfractions() {
    this.radarService.getInfractions().subscribe((data: any) => {
      this.infractions = data;
    });
  }
  private getRadarById(id: number) {
    this.radarService.getRadar(id).subscribe((data: any) => {
      this.radarById = data;
    });
  }
  

  public openAddDialog() {
    const dialogRef = this.dialog.open(this.addInfractionDialog);

    dialogRef.afterClosed().subscribe(result => {
    
      this.getInfractions(); 
    });
  }
  public newInfractionForm!: FormGroup;

  saveNewInfraction(){
    let vehicleSpeed = this.newInfractionForm.get("vehicleSpeed")?.value;
    let matricul = this.newInfractionForm.get("matricul")?.value;
    let dateInfraction = this.newInfractionForm.get("dateInfraction")?.value;
    let radar = this.newInfractionForm.get("radar")?.value;
    let ammountFine = this.newInfractionForm.get("ammountFine")?.value;
    this.getRadarById(radar);

    let infraction = {
      "vitesseVehicule": vehicleSpeed,
      "numMatricule": matricul,
      "numRadar":radar,
      "montantFraction":ammountFine,
      "date":dateInfraction
  };
    
    
    console.log(radar.listIdInfractions)

    this.radarService.saveInfraction(infraction).subscribe((data: any) => {
      this.savedInfraction = data;
      this.id=data.id;
      console.log(this.id);
      this.radarService.updateRadar(radar, this.id, this.radarById ).subscribe((data: any) => {
        this.radarById = data;
      });
    });
    
    
  }

  private initFormBuilder() {
    this.newInfractionForm = this.formBuilder.group({
      
      vehicleSpeed: this.formBuilder.control('', [Validators.required]),
      matricul: this.formBuilder.control('', [Validators.required]),
      radar: this.formBuilder.control('', [Validators.required]),
      ammountFine: this.formBuilder.control('', [Validators.required]),
      dateInfraction: this.formBuilder.control('', [Validators.required])
    });
  }
}
