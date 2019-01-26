import { Component, OnInit, ViewChild, Input } from '@angular/core';
import { LatLngLiteral } from '@agm/core';
import { ParkServiceService } from '../park-service.service';
import { Coordinates } from '../commons/Parkanlage';
import { GMCoordinates } from '../commons/GMCoordinates';
@Component({
  selector: 'app-park',
  templateUrl: './park.component.html',
  styleUrls: ['./park.component.css']
})
export class ParkComponent implements OnInit {
  lat: number = 48.22343080198198;
  lng: number = 16.302846582075926;
  zoom: number = 20;
  paths: LatLngLiteral[] = [];
  @Input() coordinates: Coordinates[];

  constructor(private parkService: ParkServiceService) { }

  ngOnInit() {
    console.log(this.coordinates);
    this.coordinates.forEach(element => {
      this.paths.push(new GMCoordinates(element.lat, element.lon));
    });
    console.log("path lat" + this.paths[0].lat);
  }
}