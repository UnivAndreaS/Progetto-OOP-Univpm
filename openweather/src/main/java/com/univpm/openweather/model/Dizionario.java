package com.univpm.openweather.model;

import java.util.HashMap;

public class Dizionario {
	
	//attributi
	private HashMap<String,Integer> elencoCittàNome = new HashMap<String,Integer>();
	private HashMap<Integer,Integer> elencoCittàId = new HashMap<Integer,Integer>();
	private String città;
	private int iD;
	private int lat_lon;
	
	//metodi
		//metodi per aggiungere a Dizionario città e coordinate
	public void putElencoNome(String città, int lat_lon) { //dati da prendere tramite API 
		this.elencoCittàNome.put(this.città,this.lat_lon);
	}
	
	public void putElencoiD(int iD, int lat_lon) {
		this.elencoCittàId.put(this.iD,this.lat_lon);
	}
		//metodi per stampare coordinate in base nome/iD
	public void getElencoNome(String città) { //dati da prendere tramite API 
		System.out.println(this.elencoCittàNome.get(this.città));
	}
	
	public void getElencoiD(int iD) {
		this.elencoCittàId.get(this.iD);
	}
}