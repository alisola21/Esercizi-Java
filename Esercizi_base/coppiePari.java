
public class coppiePari {

	public static void main(String[] args) {
		//array di valori non chiesti all'utente
		int valori [] = {5, 6, 11, 13, 9, 14, 31, 90, 21, 30};
		
		//scorro l'array con due cicli for per torvare le coppie di numeri for 
		for (int i = 0; i < 9; i++) { 
			//scorro fino a 9 perché l'ultimo elem (30) può essere già stato accoppiato (si può usare anche i < valori.lengh()-1)
				
			//scorre l'array con un altro indice partendo dall'iesimo valore (da dove era rimasto i)
			for (int j = i+1; j<valori.length; j++) {
				//se i due valori sono pari, stampo la coppia di valori
				if ((valori[i] %2 == 0) && (valori[j] %2 == 0))
					 System.out.println(valori[i] + " "+ valori[j]);
			}		
			
		}
	}
}


/*Scrivere un programma "CoppiePari" che prevede un array di 10 numeri interi contenente
valori a piacere (senza chiederli all'utente) e stampa tutte le possibili coppie di numeri pari contenuti
nell'array. Ad esempio: se l'array contiene {5, 6, 11, 13, 9, 14, 31, 90, 21, 30} il programma
stampa 6 14, poi 6 90, poi 6 30, poi 14 90, poi 14 30, poi 90 30. (Il programma deve essere scritto
facendo finta di non sapere quali siano i valori inseriti nell'array)
Facoltativo: scrivere una variante del programma che si interrompe dopo aver stampato le prime 10
coppie di numeri pari.*/