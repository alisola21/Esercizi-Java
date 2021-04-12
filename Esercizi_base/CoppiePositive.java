
public class CoppiePositive {

	public static void main(String[] args) {
		int array [] = {-5, 6, -11, -3, -9, 15, -1, 90, -21, 3};
		
		for (int i = 0; i <array.length; i++) {
			for (int j = i+1; j<array.length; j++) {
				if ((array[i] > 0) && (array[j] > 0)) 
					System.out.println(array[i] + " e " +array[j]);
			}
		}

	}

}

/*Scrivere un programma "CoppiePositive" che prevede un array di 10 numeri interi con-
tenente valori a piacere (senza chiederli all'utente) e stampa tutte le possibili coppie di numeri positivi
contenuti nell'array. Ad esempio: se l'array contiene {-5, 6, -11, -3, -9, 15, -1, 90, -21, 3} il
programma stampa 6 15, poi 6 90, poi 6 3, poi 15 90, poi 15 3, poi 90 3. (Il programma deve essere
scritto facendo nta di non sapere quali siano i valori inseriti nell'array)
Facoltativo: scrivere una variante del programma che si interrompe dopo aver stampato le prime 10
coppie di numeri positivi.*/