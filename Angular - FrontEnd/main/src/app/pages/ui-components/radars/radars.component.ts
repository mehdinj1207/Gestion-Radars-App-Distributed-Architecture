import { HttpClient } from '@angular/common/http';
import { Component, TemplateRef, ViewChild } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MatDialog } from '@angular/material/dialog';
import { Router } from '@angular/router';
import { Radar } from 'src/app/models/radar.model';
import { RadarsService } from 'src/app/services/radars/radars.service';

@Component({
  selector: 'app-radars',
  templateUrl: './radars.component.html',
  styleUrls: ['./radars.component.scss']
})
export class RadarsComponent {
  displayedColumns: string[] = ['id', 'maxSpeed', 'longitude', 'latitude', 'consult', 'delete'];
  @ViewChild('addRadarDialog') addRadarDialog!: TemplateRef<any>;
  private savedRadar!: Object;
  public radars : Array<Radar> = [];
  dataSource = [
    { id: 1, maxSpeed: 100, longitude: 50, latitude: 30 },
    { id: 2, maxSpeed: 120, longitude: 60, latitude: 35 },
    { id: 3, maxSpeed: 90, longitude: 55, latitude: 40 }
  ];

  ngOnInit(): void {
    this.getRadars();
    this.initFormBuilder();
    console.log("radar",this.radars)
  }
  hidden = false;

  toggleBadgeVisibility() {
    this.hidden = !this.hidden;
  }

  constructor(private router: Router, private radarService: RadarsService, private http: HttpClient, private formBuilder: FormBuilder, private dialog: MatDialog){

  }


  private getRadars() {
    // Get the list of radars
    this.radarService.getRadars().subscribe((data: any) => {
      this.radars = data;
    });
  }
  public openAddDialog() {
    const dialogRef = this.dialog.open(this.addRadarDialog);

    dialogRef.afterClosed().subscribe(result => {
    
      this.getRadars(); 
    });
  }
  public newRadarForm!: FormGroup;

  saveNewRadar(){
    let maximumSpeed= this.newRadarForm.get("maximumSpeed")?.value;
    let longitude = this.newRadarForm.get("longitude")?.value;
    let latitude = this.newRadarForm.get("latitude")?.value;
    let radar = {
      "vitesseMax": maximumSpeed,
      "coordonnees":[longitude,latitude]
    };
    this.radarService.saveRadar(radar).subscribe({
      next: data => this.savedRadar = data,
      error: err => console.log(err)
    });
  }

  private initFormBuilder() {
    this.newRadarForm = this.formBuilder.group({
      
      maximumSpeed: this.formBuilder.control('', [Validators.required]),
      longitude: this.formBuilder.control('', [Validators.required]),
      latitude: this.formBuilder.control('', [Validators.required]),
    });
  }

}
