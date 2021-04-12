public class SommaPrimaDopo {

	public static void main(String[] args) {
		int valori [] = {7, 11, 3, 6, 3, 8, 74, 16, 11};
		boolean trovato = false;
		for (int i = 1; i<valori.length-1; i++) {
			if (valori[i] == valori[i-1] + valori [i+1])
				trovato = true;
				
		}
		if (trovato) System.out.println("OK");
		else System.out.println("NO");
	}

}

/*Scrivere un programma "SommaPrimaDopo" che prevede un array di 10 numeri interi con-
tenente valori a piacere (senza chiederli all'utente) e stampa "OK" se l'array contiene almeno un elemento
(ad esclusione del primo e dell'ultimo) che sia uguale alla somma dell'elemento che lo precede e di quello
che lo segue. Il programma stampa "NO" altrimenti. 
Ad esempio, il programma stampa "OK" nel caso in
cui l'array contenga "8 0 -4 11 5 9 4 6 2 -8" (poiche 9 = 5 + 4) e stampa "NO" se l'array contiene
"8 4 11 5 -14 23 71 -33 10 41" (nessun elemento e uguale alla somma dei due adiacenti ad esso).
1*/