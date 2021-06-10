
public class DistributoreBenzina {
	
	/*VAR D'ISTANZA*/
	public double deposito; //quantitativo di benzina disponibile
	public double euroPerLitro; //prezzo della benzina
	
	/*COSTRUTTORE*/
	public DistributoreBenzina(double unPrezzoPerLitro) {
		euroPerLitro = unPrezzoPerLitro;
		deposito = 0;
	}
 	
	/*METODI*/
	//Rifornisce il distributore di benzina
	public void rifornisci(double unaQuantita) {
		deposito = deposito + unaQuantita;
	}
	
	
	public void vendi(double euro, Car automobile) {
		//vende una quantita' di benzina corrispondente  all'ammontare di euro pagato
		double benzina_venduta = euro/euroPerLitro;
		deposito = deposito - euroPerLitro;
		//rifornisce l'automobile con il metodo rifornimento() della classe Car
		automobile.rifornimento(benzina_venduta);
	}
	
	// aggiorna il prezzo della benzina
	public void aggiorna(double unPrezzoPerLitro) {
		euroPerLitro = unPrezzoPerLitro;
	}
	
	// Retituisce la quantita' di carburante
	public double getBenzina() {
		return deposito;
	}
 	
	
}


/*Progettare una classe di nome DistributoreBenzina, per rappresentare un distributore di carburante
 * Tale classe prevede due variabili d'istanza. 
 	* var deposito, di tipo double -> contiene il quantitativo di benzina disponibile al distributore. 
 	* var euroPerLitro di tipo double -> rappresenta il prezzo della benzina, espresso in euro per litro.
 * Costruttore public DistributoreBenzina(double unPrezzoPerLitro) -> che prende come parametro esplicito 
 * il prezzo in euro per un litro di benzina. 
 * La quantita' iniziale di benzina disponibile e' zero. 
 * La classe deve inoltre implementare i seguenti metodi: 
 	* public void rifornisci(double unaQuantita) -> rifornisce il distributore di benzina. 
 	* public void vendi(double euro, Car unaAutomobile) ->  vende una quantita' di benzina corrispondente 
 	  all'ammontare di euro pagato che va a rifornisce l'automobile passata come parametro esplicito. 
 	* public void aggiorna(double unPrezzoPerLitro), che aggiorna il prezzo della benzina.
 * */