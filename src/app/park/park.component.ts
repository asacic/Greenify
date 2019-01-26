import { Component, OnInit, ViewChild } from '@angular/core';
import { LatLngLiteral } from '@agm/core';
import { ParkServiceService } from '../park-service.service';

@Component({
  selector: 'app-park',
  templateUrl: './park.component.html',
  styleUrls: ['./park.component.css']
})
export class ParkComponent implements OnInit {
  lat: number = 48.22343080198198;
  lng: number = 16.302846582075926;
  zoom: number = 20;

  paths: Array<LatLngLiteral> = [
    { lng: 16.302846582075926, lat: 48.22343080198198 },
    { lng: 16.30271056091264, lat: 48.22355413748643 },
    { lng: 16.301884570597938, lat: 48.22341534344696 }
  ]
  constructor(private park: ParkServiceService) { }
  ngOnInit(
  ) {
    this.park.getAllCoordinates().subscribe(x => console.log(x.features[0].geometry.coordinates[0]));

  }
}