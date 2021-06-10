
public class Dipendente {

	/**VARIABILI D'ISTANZA**/
	public String nome;
	public double stipendio;
	
	
	/**COSTRUTTORI**/
	//costruttore che costruisce l'oggetto 'dipendente'
	public Dipendente() {
		nome = " ";
		stipendio = 0;
	}
	
	
	public Dipendente(String nomeDipendente, double stipendioDipendente) {
	//Costruttore che inizializza le variabili con valori predefiniti	
		nomeDipendente = nome;
		stipendioDipendente = stipendio;
	}
	
	/**METODI**/
	
	//restituisce il nome del dipendente
	public String getNome() {
		return nome;
	}
	
	//restituisce lo stipendio del dipendente
	public double getStipendio() {
		return stipendio;
	}
	//cambia il nome del dipendente
	public void setNome(String nuovo_nome) {
		nome = nuovo_nome;
	}
	
	//cambia il valore dello stipendio
	public void setStipendio(double nuovo_stipendio) {
		stipendio = nuovo_stipendio;
	}
	
	//incrementa lo stipendio del dipendente
	public void aumento(double percentuale) {
		stipendio = stipendio + ((stipendio * percentuale)/100);
		
	}
}


/*Progettare una classe di nome Dipendente. 
 * Tale classe prevede due variabili di istanza 
	 * var nome -> di tipo String 
	 * var stipendio -> di tipo double. 
 * Scrivere un costruttore con due parametri (nome e stipendio).
* La classe deve inoltre implementare i seguenti metodi. 
	 * Un metodo public String getNome() ->  restituisce il nome del dipendente. 
	 * Un metodo public double getStipendio() -> restituisce lo stipendio del dipendente.
	 * Un metodo public void setStipendio(double nuovoStipendio) che modifica il valore dello stipendio. 
	 * Un metodo public void setNome(String nuovoNome) che cambia il nome al dipendente. 
	 * Un metodo aumento(double percentuale) -> incrementa lo stipendio del dipendente secondo 
	 * una certa percentuale.*/