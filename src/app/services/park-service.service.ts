import { Injectable, isDevMode } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Feature } from '../commons/Parkanlage';
import { debug } from 'util';

@Injectable({
  providedIn: 'root'
})
export class ParkServiceService {

  constructor(private http: HttpClient) { }


  getAllFeatures(special_infrastructure: String): Observable<Feature[]> {
    switch(special_infrastructure) {
      case "wc": {
        if(isDevMode()) {
          return this.http.get<Feature[]>("/greenify_war_exploded/api/getWC?wc=1");
        }
        else
        {
          return this.http.get<Feature[]>("http://localhost:8080/greenify_war_exploded/api/getWC?wc=1");
        }
      }
      case "hz": {
        if(isDevMode()) {
          return this.http.get<Feature[]>("/greenify_war_exploded/api/getHundezone?hz=1");
        }
        else {
          return this.http.get<Feature[]>("http://localhost:8080/greenify_war_exploded/api/getHundezone?hz=1");
        }
      }
      case "sp": {
        if(isDevMode()) {
          return this.http.get<Feature[]>("/greenify_war_exploded/api/getSpielplatz?sp=1")
        }
        else {
          return this.http.get<Feature[]>("http://localhost:8080/greenify_war_exploded/api/getSpielplatz?sp=1");
        }
      }
      case "lo": {
        if(isDevMode()) {
          return this.http.get<Feature[]>("/greenify_war_exploded/api/getLokal?lokal=1");
        }
        else {
          return this.http.get<Feature[]>("http://localhost:8080/greenify_war_exploded/api/getLokal?lokal=1");
        }
        
      }
    }
  }
  
}
