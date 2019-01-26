import { Component, OnInit } from '@angular/core';
import { ParkServiceService } from './park-service.service';
import { Feature } from './commons/Parkanlage';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'greenify';
  features: Feature[];
  lat: number = 48.222378;
  lng: number = 16.3226816;
  zoom: number = 11;
  constructor(private parkService: ParkServiceService) {

  }

  ngOnInit() {
    this.parkService.getAllFeatures().subscribe(x => {
      console.log(x);
      this.features = x
    });
    /*if (navigator.geolocation) {
      navigator.geolocation.getCurrentPosition((position) => {
        this.lat=position.coords.latitude;
        this.lng=position.coords.longitude;
      });
    } else {
      alert("Geolocation is not supported by this browser.");
    }*/
  }
}
