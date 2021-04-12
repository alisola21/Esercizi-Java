
public class SommaSeguenti {

	public static void main(String[] args) {
		int valori []  = {3, -5, 3, 4, 11, 2, 9, 4, 3, 2};
		boolean somma_ok = false;
		
		for (int i = 0; i<valori.length-1; i++) {
			int somma = 0;
			for (int j = i+1; j<valori.length-1; j++) {
				somma += valori[j];
				
			}
			if (valori[i]== somma) 
				somma_ok = true;
				
				
		}
		if (somma_ok) System.out.println("OK");
		
		
	}
}

/*Scrivere un programma SommaSeguenti che prevede un array di 10 numeri interi contenente valori a piacere (senza chiederli all’utente) 
 * e stampa OK se l’array contiene un elemento 
 * che è uguale alla somma di tutti gli elementi che lo seguono. 
 * Ad esempio, se l’array contiene 3 -5 3 4 11 2 9 4 3 2 il programma stampa OK perché il 9 è uguale alla somma degli elementi che lo seguono, cioè 4 3 2. 
 * Se l’array invece contiene 1 2 3 4 5 6 7 8 9 10 il programma non stampa nulla.
 */
