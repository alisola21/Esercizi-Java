
public class UsaSpettacolo {

	public static void main(String[] args) {
		//crea degli oggetti 'persona'
		Persona p1 = new Persona("Mario Rossi", "Via Garibaldi 23");
		String stringa = p1.toString(); //invocazione metodo toString
		System.out.println(stringa); //restituisce Persona(classe) @ 2f92e0f4 (Hash code)
		
		
		Persona p2 = new Persona("Federico Bianchi", "Via Mazzini 44");
		
		//aggiungo a queste persone anche uno studente e un professore che sono estensioni della classe persona 
		Professore prof = new Professore("Carlo Grigi", "Via Neri 5", "aa4567", "Dip. di Informatica");
		Studente stud = new Studente("Giorgia Verdi", "Via Cavour 4");
		
		
		//crea uno nuovo spettacolo
		Spettacolo s = new Spettacolo ("Machbeth", "Attori Dilettanti", "25/12/2013",  "21.00");
		
		//prenota i posti per le due persone
		
		boolean prenotazione1 = s.prenota(p1);
		boolean prenotazione2 = s.prenota(p2);;
		boolean prenotazione3 = s.prenota(prof);
		boolean prenotazione4 = s.prenota(stud);
		
		/*controlla che la prenotazione sia andata a buon fine (se no è stato possibile fare una delle due prenotazioni 
		stampa un messaggio di errore*/
		if (!prenotazione1 || !prenotazione2 || !prenotazione3 || !prenotazione4) System.out.println("Sono stati riscontrari dei problemi durante la prenotazione...");
		
		//Stampa l'elenco delle prenotazioni
		s.stampaPrenotazioni();
		
		//stampa i posti disponibili per lo spettacolo
		System.out.println("Posti ancora disponibili: " +s.postiDisponibili());		

	}

}
