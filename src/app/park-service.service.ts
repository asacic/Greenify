import { Injectable, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Feature } from './commons/Parkanlage';

@Injectable({
  providedIn: 'root'
})
export class ParkServiceService {

  constructor(private http: HttpClient) { }


  getAllFeatures(): Observable<Feature[]> {

    //return this.http.get<Feature[]>("/greenify_war_exploded/api/getHundezone?hz=0");
    return this.http.get<Feature[]>("/greenify_war_exploded/api/getHundezone?hz=1");
    //return this.http.get<Feature[]>("/greenify_war_exploded/api/getSpielplatz?sp=0");
    //return this.http.get<Feature[]>("/greenify_war_exploded/api/getSpielplatz?sp=1");
    //return this.http.get<Feature[]>("/greenify_war_exploded/api/getWC?wc=0");
    //return this.http.get<Feature[]>("greenify_war_exploded/api/getWC?wc=1");
    //return this.http.get<Feature[]>("/greenify_war_exploded/api/getLokal?lokal=0");
    //return this.http.get<Feature[]>("/greenify_war_exploded/api/getLokal?lokal=1");
  
    //return this.http.get<Feature[]>("/greenify_war_exploded/api/getHundezone?hz=1");
  }
  
}
