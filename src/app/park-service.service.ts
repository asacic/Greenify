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

    return this.http.get<Feature[]>("/greenify_war_exploded/api/getText?arg1=0");
  }
  
}
