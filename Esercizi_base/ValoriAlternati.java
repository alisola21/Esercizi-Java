
public class ValoriAlternati {

	public static void main(String[] args) {
		int array [] = {-3, 0, -1, 8, 0, 11, -2, 1,-9, 4};
		
		boolean trovato = false;
	
		for (int i = 0; i <array.length-1; i++) {
			if (array[i] <= 0 && array[i+1] >= 0) 
				trovato = true;
		}
		if (trovato) 
			System.out.println("Ok");
		
	}

}

/*Scrivere un programma ValoriAlternati che prevede un array di 10 numeri interi a piacere (senza chiderli all'utente). 
 * Il programma stampa "OK" se l'array contiene valori positivi (maggiori o uguali a zero) e negativi (minori o uguali a zero) 
 * alternati, partendo da un valore negativo. Non stampa nulla altrimenti. Ad esempio, se l'array contiene i 
 * valori -3 0 -1 8 0 11 -2 1 -9 4 il programma stampa "OK". 
 * Mentre se contiene i valori 5 4 3 -2 1 0 -1 -4 10 4 il programma non stampa nulla.*/
 