import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Infraction } from 'src/app/models/infraction.model';
import { Owner } from 'src/app/models/owner.model';
import { Radar } from 'src/app/models/radar.model';
import { Vehicle } from 'src/app/models/vehicle.model';

@Injectable({
  providedIn: 'root'
})
export class RadarsService {

  constructor(private http: HttpClient) {

  }

  public getRadars():Observable<Array<Radar>>{
    return this.http.get<Array<Radar>>("http://localhost:8888/RADAR-SERVICE/api/radars")
  }
  
  public searchVehicles(keyword: string): Observable<Vehicle[]> {
    return this.http.get<Vehicle[]>("http://localhost:8888/IMMATRICULATION-SERVICE/vehicules/keyword/" + keyword);
  }


  public getRadar(id: any):Observable<Radar>{
    return this.http.get<Radar>("http://localhost:8888/RADAR-SERVICE/api/radars/"+id)
  }

  public getInfractions():Observable<Infraction>{
    return this.http.get<Infraction>("http://localhost:8888/INFRACTION-SERVICE/infractions")
  }

  public getVehicles():Observable<Array<Vehicle>>{
    return this.http.get<Array<any>>("http://localhost:8888/IMMATRICULATION-SERVICE/vehicules")
  }
  public getOwners():Observable<Array<Owner>>{
    return this.http.get<Array<any>>("http://localhost:8888/IMMATRICULATION-SERVICE/proprietaires")
  }


  deleteVehicle(id: any) {
    return this.http.delete("http://localhost:8888/IMMATRICULATION-SERVICE/vehicules/"+id)
  }

  deleteRadar(id: any) {
    return this.http.delete("http://localhost:8888/RADAR-SERVICE/web/radars/"+id)
  }

  deleteInfraction(id: any) {
    return this.http.delete("http://localhost:8888/INFRACTION-SERVICE/web/infractions/"+id)
  }

  saveRadar(Radar: any) {
    return this.http.post("http://localhost:8888/RADAR-SERVICE/api/radars", Radar)
  }
  updateRadar(idRadar: any, idInfraction: any, radar: any) {
    return this.http.put("http://localhost:8888/RADAR-SERVICE/api/radars/"+idRadar+"/infraction/"+idInfraction, radar)
  }
  saveInfraction(infraction: any) {
    return this.http.post("http://localhost:8888/INFRACTION-SERVICE/infractions", infraction)
  }

  saveVehicle(vehicle: any) {
    return this.http.post("http://localhost:8888/IMMATRICULATION-SERVICE/vehicules", vehicle)
  }

  saveOwner(owner: any) {
    return this.http.post("http://localhost:8888/IMMATRICULATION-SERVICE/proprietaires", owner)
  }

  addVehicleToOwner(savedVehicle: any, savedOwner: any) {
    return this.http.post("http://localhost:8888/IMMATRICULATION-SERVICE/vehicules/"+savedVehicle.id, savedOwner);
  }
  deleteOwner(id: any) {
    return this.http.delete("http://localhost:8888/IMMATRICULATION-SERVICE/proprietaires/"+id)
  }
}
