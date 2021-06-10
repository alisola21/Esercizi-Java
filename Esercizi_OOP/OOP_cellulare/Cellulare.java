
public class Cellulare {
	
	//VAR D'ISTANZA
	private double credito; //euro disponibili nel telefono x le chiamate
	private int numeroChiamate; //numero di chiamate effettuate dal cellulare
	
	//COSTRUTTORE -> creo uno oggetto cellulare e inizializzo la carica e il numero chiamate
	public Cellulare(double creditoIniziale, int numChiamate) {
		creditoIniziale = credito;
		numChiamate = numeroChiamate;
		
	}
	

	//METODI
	//metodo che fa una ricarica al cellulare
	public void ricarica (double unaRicarica) {
		credito = credito + unaRicarica;
	}
	
	public void chiama(double minChiamata) {
		//aggiorno il credito disponibile sottraendo 0.20 cent per ogni min di chiamata
		credito = credito - (0.20*minChiamata);
		//incremento il numero di chiamate
		numeroChiamate = numeroChiamate +1;
	}
	
	
	public double chiama404() {
		//restituisce il valore di carica disponibile
		return credito;
	}
	
	//restituisce il numero di chiamate
	public int getNumeroChiamate() {
		return numeroChiamate;
	}
	
	//azzera il numero di chiamate
	public void azzeraChiamate() {
		numeroChiamate = 0;
	}
}
