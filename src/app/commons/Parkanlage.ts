
export interface Geometry {
    type: string;
    coordinates: number[];
}

export interface Properties {
    OBJECTID: number;
    TEXT13ID: string;
    F_TYP: string;
    T_TEXT: string;
    T_LANG: string;
    O: number;
    P: number;
    O_UEREG: number;
    O_REGION: number;
    O_LOKAL: number;
    P_WLD: number;
	P_WAS: number,
	P_WIE: number,
	P_WGT: number,
	P_LW: number,
	P_PK: number,
	P_GPK: number,
	P_GST: number,
	P_SGR: number,
	P_AGR: number,
	P_RGR: number,
	P_URB: number,
	Q_MOB: number,
	Q_SPI: number,
	Q_GRI: number,
	Q_HUN: number,
	Q_BAB: number,
	Q_WC: number,
	Q_SPO: number,
	Q_TRB: number,
	UMFANG: number,
	FLAECHE: number,
	SE_ANNO_CAD_DATA: any
}

export interface Feature {
    type: string;
    id: string;
    geometry: Geometry;
    geometry_name: string;
    properties: Properties;
}

export interface Parkanlagen {
    type: string;
    totalFeatures: number;
    features: Feature[];
}

