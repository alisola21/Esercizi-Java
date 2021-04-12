
public class Spettacolo {
	
	/**VARIABILI**/
	private String titolo; // titolo dello spettacolo
	private String compagnia; // compagnia teatrale
	private String data; // data spettacolo
	private String ora; //ora Spettacolo
	
	//nuove var statiche con i prezzi dei biglietti
	private static double prezzoIntero = 10.0;
	private static double prezzoRidotto = 7.0;
	
	private Persona [] spettatori; // array che contiene gli spettatori ( classe Persona )
	//variabile d'istanza che serve per contare i posti prenotati (contatore inizializzato a zero )
	private int postiPrenotati = 0;
	// costante condivisa che indica la capienza del teatro (100 posti disponibili)
	private static final int CAPIENZA = 100;
	
	/**COSTRUTTORE**/
	public Spettacolo ( String titolo, String compagnia, String data, String ora ) {
		this.titolo = titolo;
		this.compagnia = compagnia;
		this.data = data;
		this.ora = ora;
		// inizializza l'array (inizialmente pieno di null perché 
		//non ho ancora nessun spettatore)
		this.spettatori = new Persona [CAPIENZA];
	}
	
	/**METODI**/
	
	//METODOGETPREZZo -> calcola il prezzo in base al tipo di spettatore
	
	/*METODO POSTIDISPONIBILI -> restituisce il numero di posti ancora disponibili 
                                sottraendo dalla capienza i posti prenotati*/
	public int postiDisponibili() {
		return CAPIENZA - postiPrenotati;
	}
	
	// METODO PRENOTA -> consente di prenotare un nuovo posto e restituisci true o false a seconda della disponibilità dei posti
	public boolean prenota (Persona spettatore) {
		if (postiDisponibili() > 0) { //se ci sono posti disponibili
            spettatori [postiPrenotati] = spettatore; //faccio la prenotazione e incremento il valore di postiPrenotati
			postiPrenotati ++;
		    return true; //restituiscotreu se ci sono posti disponibili ed è stato possibile prenotare il posto
		}
			else return false; // restituisce false se non ci sono posti disponibili
	}
	
	// METODO STAMPAPRENOTAZIONI -> Scorre l'elenco delle persone contenute nell'array 'spettatori' stampa l'elenco delle prenotazioni
	public void stampaPrenotazioni () {
		System.out.println("Spettacolo " + titolo);
		System.out.println ("della compagnia teatrale "+ "'" +compagnia+ "'");
		System.out.println("del " + data + " alle ore: " +ora);
		System.out.println(); // riga vuota
		for (int i = 0; i < postiPrenotati; i ++) {
				spettatori [i].visualizza (); //richiamo il metodo visualizza
		}
	}
	
	public double getPrezzo(Persona p) {
		//controllo che p sia un professore (contenga tutte le info dell'oggetto professore)
		if (p instanceof Professore) {
			return prezzoRidotto;
		//controllo che p sia uno studente (contenga tutte le info dell'oggetto studente)
		} else if (p instanceof Studente) { //se la persona è uno studente
			if(!((Studente) p).isFuoriCorso()) 
			/*forzo il compilatore con un typecast a considerare p come studente e non come persona per 
			controllare che lo studente sia fuori corso*/ 
				return prezzoRidotto;
			else
				return prezzoIntero;
		} else 
			return prezzoIntero;
	}	
}
