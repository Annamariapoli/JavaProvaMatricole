package it.polito.tdp.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Studente {   //voglio uno studente che abbia come attributi: la matricola e una lista di corsi a cui è iscritto
	
	private String matricola;
	private List<String> corsi = new ArrayList<String>();   
	
	//altro tipo di costruttore
	/*public Studente(String matricola, List<String> corsi) {
		super();
		this.matricola = matricola;
		this.corsi= corsi;
	}
	*/
	
	public Studente(String matricola, String... args){   //posso mettere una o piu stringhe x memorizzare i corsi dello studente
		this.matricola = matricola;
		for(String s:args){
			corsi.add(s);                              //agg corsi alla lista ke hanno gli studenti
		}
		
	}
	
	public String getMatricola() {
		return matricola;
	}
	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	public List<String> getCorsi() {
		return corsi;
	}
	public void setCorsi(List<String> corsi) {
		this.corsi = corsi;
	}
	
	public void  aggiungiCorso(String corso){ //ok             
		boolean trovato= false;
		for(String c: corsi){
			if(c.equals(corso))
				trovato=true;
		}
		if(!trovato){
			corsi.add(corso);
		}
	}
	
	public void rimuoviCorso(String corso){                     //ok
		if(corsi.contains(corso)){
			corsi.remove(corso);
		}
	}
	
	
	public List<String> elencoCorsi(String matricola){  //è giusto il parametro String matricola? //oppure non devo passare nulla?
		return corsi;                                  //inoltre: Collections <String> oppure va bene List <String>  ??
	}
	
	public void stampaCorsiDiUnoStudente(){
		System.out.println(corsi);
	}

	public String toString(){                        //se tolgo il toString() e chiamo nel main aggiungiS() mi  stampa "cose strane"
		String risu = "";
		risu = matricola+" "+corsi+ "\n";
		return risu;
	}
}
