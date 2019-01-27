import { Injectable, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { GMCoordinates } from '../commons/GMCoordinates';

@Injectable({
  providedIn: 'root'
})
export class LocalPositionService {

  constructor(private http: HttpClient) { }

  ngOnInit() {

  }

  getLocalPosition(): Observable<GMCoordinates> {
    return new Observable((observer) => {
      if (navigator.geolocation) {
        navigator.geolocation.getCurrentPosition((position) => {
          var localPosition = new GMCoordinates(position.coords.latitude, position.coords.longitude);
          observer.next(localPosition);
          observer.complete();
        });
      } else {
        alert("Geolocation is not supported by this browser.");
      }
    })
  }
}
