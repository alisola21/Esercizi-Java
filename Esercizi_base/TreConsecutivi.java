
public class TreConsecutivi {

	public static void main(String[] args) {
		int array[] = {2, 7, 9, 21, 5, 5, 5, 34, 67, 43};
		boolean trovato = false;
		
		for (int i = 0; i < 7; i++) {
			if (array[i] == array[i+1] && array[i+1] == array[i+2]) {
				trovato = true;
			}
		}
		
		if (trovato) {
			System.out.println("Tre valori consecuitivi uguali");
		}	else System.out.println("NO");
		
	}

}

/*Scrivere un programma TreConsecutivi che prevede un array di 10 numeri interi conte-
nente valori a piacere (senza bisogno di chiederli all'utente) e stampa "Tre valori consecuitivi uguali"
se l'array contiene tre valori uguali in tre posizioni consecutive, oppure stampa "NO" altrimenti. (Il pro-
gramma deve essere scritto facendo nta di non sapere quali siano i valori inseriti nell'array)*/