import { Component, OnInit } from '@angular/core';
import { ParkServiceService } from './services/park-service.service';
import { Feature } from './commons/Parkanlage';
import { ActivatedRoute } from '@angular/router';
import { LocalPositionService } from './services/local-position.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'greenify';
  features: Feature[];
  lat: number = 48.222378; //WIEN
  lng: number = 16.3226816; //WIEN
  zoom: number = 11; //Zoom Factor
  special_infrastructure: String;

  constructor(private route: ActivatedRoute, private parkService: ParkServiceService, private localPositionService: LocalPositionService) {

  }

  ngOnInit() {
    this.route.queryParams.subscribe(params => {
      if (params["special_infrastructure"]) {
        this.special_infrastructure = params["special_infrastructure"];
        this.parkService.getAllFeatures(this.special_infrastructure).subscribe(x => {
          this.features = x
        });
      }
    })

  
    this.localPositionService.getLocalPosition().subscribe(x => {
      this.lat = x.lat;
      this.lng = x.lng;
    })
  }
}
