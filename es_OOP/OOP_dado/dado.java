import java.util.Random;
public class dado {
	
	//numero di facce del dadp
	public int numero_facce = 6;
	//oggetto genera dato della classe ùrandom
	private Random genera_dado;
	
	//creo un dado utilizzando un costruttore
	public dado(int num_facce) {
		numero_facce = num_facce;
		genera_dado = new Random();
	}
	
	//metodo che cambia il numero delle facce del dato
	public void setFacce(int nuovo_valore_facce) {
		//imposto un nuovo numero di facce
		numero_facce = nuovo_valore_facce;
	}
	
	//metodo che simula il lancio del dato e restituisce (return) il risulato del dado 
	public int lancio() {
		int risultato = genera_dado.nextInt(numero_facce) +1;
		return risultato;
	}
}

/*Scrivere un programma che usi la classe Random per simulare il lancio di un dado, 
 * visualizzando un numero casuale compreso tra 1 e 6 ogni volta che viene
 eseguito.*/