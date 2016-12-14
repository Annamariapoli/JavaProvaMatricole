package it.polito.tdp.model;
import java.util.LinkedList;
import java.util.List;

public class Model {
	
	private List<Studente> studenti = new LinkedList<Studente>();   //problema x stampare senza toString xke è una lista
	
	//aggiungo un nuovo studente:  //la matricola deve essere diversa
	
	public void aggiungiS(Studente studente){                   //funziona --> infatti non aggiunge matricole uguali
		boolean trovato = false;
		for(Studente s : studenti){
			if(s.getMatricola().equals(studente.getMatricola())){
				trovato=true;
			}
		}
		if(!trovato){
			studenti.add(studente);
		}
	}
	
	//aggiungo  1 corso ad uno studente:    //ok funziona
	
	public void aggiungiCorso(String matricola, String corso){   //forse qui nel model è inutile, xke c'è nella classe studente ke aggiunge corsi allo studente
		for(Studente s : studenti){                             //o forse non è inutile, xke qui passo una matricola
			if(s.getMatricola().equals(matricola)){            //associo la matricola ad uno studente //se c'è
				s.aggiungiCorso(corso);
			}
		}
	}	
	
	//rimuovi un corso ad uno studente:    //ok
	
	public void eliminaCorso(String matricola, String corso){
		for(Studente s : studenti){
			if(s.getMatricola().equals(matricola)){  
				s.rimuoviCorso(corso);
			}
		}
	}
	
	
	
	//cerca uno studente :  //data una matricola, ritorna tutti gli attributi dello studente (quindi di nuovo la matricola)
	
	public Studente cercaStudente(String matricola){         //funziona
		for(Studente s : studenti){
			if(s.getMatricola().equals(matricola)){
				System.out.println(s.toString());
				return  s;
			}
		}
		return null;
	}
	
	//se, passata una matricola, volessi ritornare SOLO la lista dei corsi a cui è iscritto (e non di nuovo la matricola)
	
//	public List<String> elencoCorsiStudente(String matricola){          
//		boolean trovato= false;
//		for(Studente s : studenti){
//			if(s.getMatricola().equals(matricola)){
//				trovato = true;
//				}
//		}
//		if(trovato)
//			return s.elencoCorsi(matricola);
//	}
	
	//selezionando un corso, ritorna la lista di studenti iscritti:(devono comparire SOLO le matricole)--> quindi è giusto <Studente> oppure meglio <String>
	//si puo fare senza una classe corso?

public  List<String> cercaStudentiIscritti(String corso){   //ok
		List<String> iscritti = new LinkedList<String>();
		if(corso != null){	
			for(Studente s : studenti){
				for(String c : s.getCorsi()){
				     if(c.equals(corso)){
					 iscritti.add(s.getMatricola());
				     }
			    }
			}
		}
		System.out.println(iscritti);
		return iscritti;
	}
	
	public void stampaStudenti(){          //stampa solo le matricole (no toString() in studente)
		for(Studente s: studenti){
		System.out.println(s.getMatricola());
		System.out.println(s.getCorsi());
		}                                          //creo qui il modo x visualizzarlo
	}
}
