import {Owner} from "./owner.model";

export interface Vehicle{
  id : number,
  matricule : string,
  marque : string,
  puissanceFiscale : number,
  modele : string,
  proprietaire : Owner,
}
