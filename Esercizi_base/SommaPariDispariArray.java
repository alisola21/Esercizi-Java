
public class SommaPariDispariArray {
	
	public static void main(String[] args) {
		int array[] = {4, 5, 2, 5, 7, 6, 3, 1, 3, 2};
		int sommaPari = 0;
		int sommaDispari = 0;
		
		for (int i = 0; i<array.length; i++) {
			if (array[i] % 2 == 0)
				sommaPari+=array[i];
			else if(array[i] % 2 != 0) 
				sommaDispari+=array[i];
		}
		if (sommaPari == sommaDispari) {
			System.out.println("Pari e dispari uguali");
		} else System.out.println("Pari e dispari diversi");
	}

}

/*Scrivere un programma SommaPariDispari che prevede un array di 10 numeri interi
contenente valori a piacere (senza bisogno di chiederli all'utente) e stampa Pari e dispari uguali se
la somma dei numeri in posizioni pari dell'array e uguale alla somma dei numeri in posizioni dispari,
altrimenti il programma stampa Pari e dispari diversi. (Il programma deve essere scritto facendo
nta di non sapere quali siano i valori inseriti nell'array)*/