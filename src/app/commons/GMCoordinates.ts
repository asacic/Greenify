import { LatLngLiteral } from "@agm/core";

export class GMCoordinates implements LatLngLiteral {
    lat: number;
    lng: number;
    constructor(lat: number, lng: number) {
        this.lat = lat;
        this.lng = lng;
    }
}