package it.polito.tdp.model;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Model m = new Model();
		List <String> iscrittiTemp =new ArrayList<>();
	
		/*List <String> corsiprova =new ArrayList<>();
		corsiprova.add("matematica");
		corsiprova.add("fisica");
		corsiprova.add("geografia");
		corsiprova.add("ing");
		corsiprova.add("ita");*/
		
			//	Studente s = new Studente();           sottointeso
		/*Studente s1 = new Studente ("1111", corsiprova);            //come si crea una lista?
		System.out.println(s1.getCorsi());
		
		Studente s2 = new Studente("2222", "gro", "fis");
		System.out.println(s2.getCorsi());
//		Studente s3 = new Studente ("3333", null);
//		Studente s4 = new Studente ("4444", null);
//		Studente s5 = new Studente ("5555", null);
//		Studente s6= new Studente ("6666", null);
		
//		m.aggiungiS("1111");	
//		m.aggiungiS("2222");
//		m.aggiungiS("3333");
//		m.aggiungiS("2222");            //nn la aggiunge
//		m.aggiungiS("5555");
//		m.aggiungiS("6666");
				
				
		m.stampaStudenti();
		//m.cercaStudente("6666");
		
//		s1.aggiungiCorso("mate");
		//s1.aggiungiCorso("geo");
		//s3.aggiungiCorso("ita");
		
		m.stampaStudenti();
				
				
		*/
		
		Studente s1 = new Studente("1111", "mate", "geo");
		Studente s2 = new Studente("2222", "ita", "ingl");
		Studente s3 = new Studente ("333", "ita");
		Studente s4 = new Studente ("333", "ita");
		
		m.aggiungiS(s1);
		m.aggiungiS(s2);
		m.aggiungiS(s1);
		m.aggiungiS(s3);
		m.aggiungiS(s3);
		m.aggiungiS(s4);
		m.stampaStudenti();
		
		//s1.aggiungiCorso("mate");          //ok
		//m.stampaStudenti();
		
	//	s1.rimuoviCorso("mate");            //ok
	//	m.stampaStudenti();
		//m.cercaStudentiIscritti("ita");
		//iscrittiTemp=m.cercaStudentiIscritti("ita");
		//m.stampaStudenti();
				
	
		//m.aggiungiCorso("2222", "fisica");
		//m.stampaStudenti();
		
		//m.eliminaCorso("333", "ita");
		//m.stampaStudenti();

		//m.cercaStudente("1111");
		m.cercaStudentiIscritti("ita");
		
		
		
		
	}

}
