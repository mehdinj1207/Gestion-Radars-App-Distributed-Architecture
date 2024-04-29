import { HttpClient } from '@angular/common/http';
import { Component, TemplateRef, ViewChild } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MatDialog } from '@angular/material/dialog';
import { Router } from '@angular/router';
import { Owner } from 'src/app/models/owner.model';
import { RadarsService } from 'src/app/services/radars/radars.service';

@Component({
  selector: 'app-owner',
  templateUrl: './owner.component.html',
  styleUrls: ['./owner.component.scss']
})
export class OwnerComponent {
  displayedColumns: string[] = ['id', 'nom', 'dateNaissance', 'email', 'consult', 'delete'];
  public owners : Array<Owner> = [];
  private savedOwner!: Object;
  @ViewChild('deleteOwnerDialog') deleteOwnerDialog!: TemplateRef<any>;
  @ViewChild('addOwnerDialog') addOwnerDialog!: TemplateRef<any>;

  dataSource = [
    { id: 1, maxSpeed: 100, longitude: 50, latitude: 30 },
    { id: 2, maxSpeed: 120, longitude: 60, latitude: 35 },
    { id: 3, maxSpeed: 90, longitude: 55, latitude: 40 }
  ];

  ngOnInit(): void {
    this.getOwners();
    this.initFormBuilder();
  }
  hidden = false;

  toggleBadgeVisibility() {
    this.hidden = !this.hidden;
  }

  constructor(private router: Router, private radarService: RadarsService, private http: HttpClient, private formBuilder: FormBuilder, private dialog: MatDialog){

  }


  private getOwners() {
    // Get the list of radars
    this.radarService.getOwners().subscribe((data: any) => {
      this.owners = data;
    });
  }
  
  public openDeleteDialog(id:number) {
    const dialogRef = this.dialog.open(this.deleteOwnerDialog);

    dialogRef.afterClosed().subscribe(result => {
    
      this.deleteOwner(id)
      this.getOwners(); 
    });
  }
  deleteOwner(id: number){
    this.radarService.deleteOwner(id).subscribe({
      next: () => {
        this.getOwners(); 
      },
      error: err => console.log(err)
    });
  }
  public openAddDialog() {
    const dialogRef = this.dialog.open(this.addOwnerDialog);

    dialogRef.afterClosed().subscribe(result => {
    
      this.getOwners(); 
    });
  }
  public newOwnerForm!: FormGroup;

  saveNewOwner(){
    let vehicleOwnerName = this.newOwnerForm.get("ownerName")?.value;
    let vehicleOwnerBirthdate = this.newOwnerForm.get("ownerBirthdate")?.value;
    let vehicleOwnerEmail = this.newOwnerForm.get("ownerEmail")?.value;
    let owner = {
      "nom": vehicleOwnerName,
      "dateNaissance": vehicleOwnerBirthdate,
      "email": vehicleOwnerEmail
  };
    this.radarService.saveOwner(owner).subscribe({
      next: data => this.savedOwner = data,
      error: err => console.log(err)
    });
  }

  private initFormBuilder() {
    this.newOwnerForm = this.formBuilder.group({
      
      ownerName: this.formBuilder.control('', [Validators.required]),
      ownerBirthdate: this.formBuilder.control('', [Validators.required]),
      ownerEmail: this.formBuilder.control('', [Validators.required]),
    });
  }


}
