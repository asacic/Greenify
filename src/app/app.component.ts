import { Component, EventEmitter } from '@angular/core';
import { ParkServiceService } from './services/park-service.service';
import { Feature } from './commons/Parkanlage';
import { ActivatedRoute } from '@angular/router';
import { LocalPositionService } from './services/local-position.service';
declare var google: any;
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'greenify';
  features: Feature[];
  filtered_features: Feature[];
  lat: number = 48.222378; //WIEN
  lng: number = 16.3226816; //WIEN
  zoom: number = 11; //Zoom Factor
  special_infrastructure: String;
  map: any;

  mapReady(event: EventEmitter<any>) {
    this.map = event;
    console.log(this.map);
    this.map.controls[google.maps.ControlPosition.TOP_LEFT].push(document.getElementById('Lokale'));
    this.map.controls[google.maps.ControlPosition.TOP_LEFT].push(document.getElementById('WC'));
    this.map.controls[google.maps.ControlPosition.TOP_LEFT].push(document.getElementById('Hundezone'));
    this.map.controls[google.maps.ControlPosition.TOP_LEFT].push(document.getElementById('Spielplatz'));
  }

  lokale_clicked(){
    this.filtered_features = this.features.filter(x => x.properties.O_LOKAL == 1);
  }
  wc_clicked(){
    this.filtered_features = this.features.filter(x => x.properties.Q_WC == 1);
  }

  hundezone_clicked() {
    this.filtered_features = this.features.filter(x => x.properties.Q_HUN == 1);
  }

  spielplatz_clicked() {
    this.filtered_features = this.features.filter(x => x.properties.Q_SPI == 1);
  }

  constructor(private route: ActivatedRoute, private parkService: ParkServiceService, private localPositionService: LocalPositionService) {

  }

  ngOnInit() {
    this.route.queryParams.subscribe(params => {
      if (params["special_infrastructure"]) {
        this.special_infrastructure = params["special_infrastructure"];
        this.parkService.getAllFeatures(this.special_infrastructure).subscribe(x => {
          this.features = x
          this.filtered_features = x;
        });
        
      }
      else {
        this.parkService.getAllFeatures("wc").subscribe(x => {
          this.features = x
          this.filtered_features = x;
        });
      }
    })


    this.localPositionService.getLocalPosition().subscribe(x => {
      this.lat = x.lat;
      this.lng = x.lng;
    })
  }
}
