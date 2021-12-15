package com.univpm.openweather.model;

public class InformazioniMeteo {
	
	//classe che contiene i dati meteo richiesti per il progetto
	
	//attributi
	private int tempEff; //data in Kelvin
	private int tempPer;
	private int umidità; //data in %
	
	//getter 
	public int getTempEff() {
		return tempEff;
	}
	public int getTempPer() {
		return tempPer;
	}
	public int getUmidità() {
		return umidità;
	}
	
	//setter
	public void setTempEff(int tempEff) { 
		this.tempEff = tempEff;
	}
	public void setTempPer(int tempPer) {
		this.tempPer = tempPer;
	}
	public void setUmidità(int umidità) {
		this.umidità = umidità;
	}
	
}