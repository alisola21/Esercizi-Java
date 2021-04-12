import java.util.Scanner;
public class posizioneMinimo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci un numero: ");
		int min = input.nextInt();
		
		
		
		int posizione_minimo = 1;
		
		for (int i = 2; i<10; i++) {
			int minimo;
			System.out.println("Inserisci un numero: ");
			int n = input.nextInt();
			if (n < min) {
				minimo = n;
				posizione_minimo = i;
			}
		}
		System.out.println("Il valore minimo si trova in posizione: " +posizione_minimo);
		input.close();
	}
	

}

/*Scrivere un programma PosizioneMinimo che chiede all'utente di inserire una sequenza di
10 interi e poi stampa la posizone nella sequenza del valore minimo inserito (INZIANDO A CONTARE
LE POSIZIONI DA 1). Ad esempio, inserendo 2 -1 20 4 -7 3 -1 13 -2 10 il programma stampa
"valore minimo in posizione 5". Risolvere questo esercizio senza usare array.*/