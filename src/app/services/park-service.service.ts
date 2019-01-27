import { Injectable, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Feature } from '../commons/Parkanlage';

@Injectable({
  providedIn: 'root'
})
export class ParkServiceService {

  constructor(private http: HttpClient) { }


  getAllFeatures(special_infrastructure: String): Observable<Feature[]> {
    switch(special_infrastructure) {
      case "wc": {
        return this.http.get<Feature[]>("greenify_war_exploded/api/getWC?wc=1");
      }
      case "hz": {
        return this.http.get<Feature[]>("/greenify_war_exploded/api/getHundezone?hz=1");
      }
      case "sp": {
        return this.http.get<Feature[]>("/greenify_war_exploded/api/getSpielplatz?sp=1")
      }
      case "lo": {
        return this.http.get<Feature[]>("/greenify_war_exploded/api/getLokal?lokal=1");
      }
    }
  }
  
}
