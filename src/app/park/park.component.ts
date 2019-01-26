import { Component, OnInit, ViewChild } from '@angular/core';

@Component({
  selector: 'app-park',
  templateUrl: './park.component.html',
  styleUrls: ['./park.component.css']
})
export class ParkComponent implements OnInit {
  lat: number = 51.678418;
  lng: number = 7.809007;
  constructor() { }
  ngOnInit() {
      
  }
}