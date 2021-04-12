import java.util.Scanner;
public class TuttiPariDispari {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci un numero");
		int n = input.nextInt();
		
		boolean trovato_pari = false;
		boolean trovato_dispari = false;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Inserisci un numero");
			n = input.nextInt();
			if (n % 2 == 0) trovato_pari = true;
			else trovato_dispari = true;
			
		}
		if (trovato_pari && trovato_dispari)
			System.out.println("Valori misti");
		else System.out.println("Valori tutti pari o tutti dispari");
		input.close();
	}

}

/*Scrivere un programma TuttiPariDispari che chiede all'utente di inserire una sequenza
di 10 interi e poi stampa "Valori tutti pari o tutti dispari" se i valori inseriti sono tutti pari,
oppure se sono tutti dispari. In caso contrario (ossia se ci sono sia valori pari, sia valori dispari) stampa
"Valori misti". Risolvere questo esercizio senza usare array.*/