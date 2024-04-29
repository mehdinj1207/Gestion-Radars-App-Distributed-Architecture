import { HttpClient } from '@angular/common/http';
import { Component, TemplateRef, ViewChild } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { MatDialog } from '@angular/material/dialog';
import { Router } from '@angular/router';
import { tap } from 'rxjs';
import { Vehicle } from 'src/app/models/vehicle.model';
import { RadarsService } from 'src/app/services/radars/radars.service';
import { VehiculeDialogComponent } from '../vehicule-dialog/vehicule-dialog.component';

@Component({
  selector: 'app-vehicles',
  templateUrl: './vehicles.component.html',
  styleUrls: ['./vehicles.component.scss']
})
export class VehiclesComponent {
  displayedColumns: string[] = ['id', 'brand', 'model', 'matricul', 'fiscalPower', 'consult', 'delete'];
  @ViewChild('deleteOwnerDialog') deleteOwnerDialog!: TemplateRef<any>;
  public vehicles : Array<Vehicle> = [];
  dataSource = [
    { id: 1, maxSpeed: 100, longitude: 50, latitude: 30 },
    { id: 2, maxSpeed: 120, longitude: 60, latitude: 35 },
    { id: 3, maxSpeed: 90, longitude: 55, latitude: 40 }
  ];

  ngOnInit(): void {
    this.getVehicles();
  }
  hidden = false;

  toggleBadgeVisibility() {
    this.hidden = !this.hidden;
  }

  constructor(private router: Router, private radarService: RadarsService, private http: HttpClient, private formBuilder: FormBuilder, public dialog: MatDialog){

  }


  private getVehicles() {
    // Get the list of vehicles
    this.radarService.getVehicles().pipe(
      tap((data: any) => {
        this.vehicles = data;
      })
    ).subscribe();
  }
  public refreshUI(){
    // Get the list of vehicles
    this.radarService.getVehicles().pipe(
      tap((data: any) => {
        this.vehicles = data;
      })
    ).subscribe();
  }
  openDialog() {
    const dialogRef = this.dialog.open(VehiculeDialogComponent);

    dialogRef.afterClosed().subscribe(result => {
      this.refreshUI(); 
    });
  }
  public openDeleteDialog(id:number) {
    const dialogRef = this.dialog.open(this.deleteOwnerDialog);

    dialogRef.afterClosed().subscribe(result => {
    
      this.deleteVehicle(id)
      this.getVehicles(); 
    });
  }
  deleteVehicle(id: number){
    this.radarService.deleteVehicle(id).subscribe({
      next: () => {
        // Refresh the page
        
      },
      error: err => console.log(err)
    });
  }

}
