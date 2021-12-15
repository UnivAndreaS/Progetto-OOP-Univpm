package com.univpm.openweather.model;

import java.util.Vector;

public class Città {
	
	//classe che definisce la città dalla quale si ottengono le previsioni
	
	//attributi
	private int lon;
	private int lat;
	private int iD;
	private String nome;
	private Vector<InformazioniMeteo> infoMeteo;
	
	//costruttore
	public Città(int lon, int lat, int iD) {
		this.lon = lon;
		this.lat = lat;
		this.iD = iD;
	}

	//getter
	public int getLon() {
		return lon;
	}

	public int getLat() {
		return lat;
	}
	
	public int getiD() {
		return iD;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Vector<InformazioniMeteo> getInfoMeteo() {
		return infoMeteo;
	}
	
	//setter
	public void setLon(int lon) {
		this.lon = lon;
	}
	
	public void setLat(int lat) {
		this.lat = lat;
	}
	
	public void setiD(int iD) {
		this.iD = iD;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setInfoMeteo(Vector<InformazioniMeteo> infoMeteo) {
		this.infoMeteo = infoMeteo;
	}
	
}