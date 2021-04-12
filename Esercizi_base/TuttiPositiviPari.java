import java.util.Scanner;
public class TuttiPositiviPari {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//chiedo all'utente quanti numeri voglia inserire
		System.out.println("Quanti numeri vuoi inserire?");
		int numeriInseriti = input.nextInt();
		
		//definisco una var booleana posPari inizializzata a true
		boolean posPari = true;
		
		//scorro i numeri utilizzando un indice i perché so esattamente quante iterazioni fare
		for (int i = 0; i< numeriInseriti; i++ ) {
			
			System.out.println("Inserisci un numero:");
			int n = input.nextInt();
			//se il numero inserito è negativo o dispari
			if (n < 0 || n % 2 != 0)
				//somma positivo diventa false
				posPari = false;
		}
		//se la var booleana resta true stampo il messaggio "Tutti positivi e pari" altrimenti stampo "NO"
		if (posPari)
			System.out.println("Tutti positivi e pari");
		else System.out.println("NO");
		input.close();
		
	}

}

/*Scrivere un programma TuttiPositiviPari che chiede all'utente di inserire una se-
quenza di interi (chiedendo prima quanti numeri voglia inserire) e poi, al termine dell'inserimento
dell'intera sequenza, stampa "Tutti positivi e pari" se i numeri inseriti sono tutti positivi e pari,
altrimenti stampa "NO". Risolvere questo esercizio senza usare array.*/