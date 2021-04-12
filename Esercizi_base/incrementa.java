
public class incrementa {

	public static void main(String[] args) {
		int array[] = {2, 7, 9, 21, 76, 5, 10, 34, 67, 43};

		for (int i = 0; i<10; i++) {
			array[i] = array[i] + i+1;
			System.out.println(array[i]);
		}
		
		
	}

}

/*Scrivere un programma Incrementa che prende un array di 10 numeri interi contenete
valori a piacere (senza bisogno di chiederli all'utente), incrementa il primo elemento di 1, il secondo
elemento di 2, il terzo elemento di 3, ecc... poi stampa tutti i valor*/