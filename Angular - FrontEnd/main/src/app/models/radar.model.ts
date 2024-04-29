import {Infraction} from "./infraction.model";

export interface Radar{
  id : number,
  vitesseMax : number,
  coordonnees : Array<number>
  listIdInfraction: Array<number>
}
