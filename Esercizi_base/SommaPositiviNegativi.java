import java.util.Scanner;
public class SommaPositiviNegativi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//chiedo all'utente di inserire una sequenza di numeri
		System.out.println("Inserisci una sequenza di interi: ");
		int valori;
		int somma_negativi = 0;
		int somma_positivi = 0;
		
			do  {
				valori = input.nextInt();
				if (valori > 0)
				somma_positivi += valori;
				//somma_positivi++;
				else 
				somma_negativi += valori;
			} while (valori != 0);
		input.close();
		System.out.println("la somma dei valori positivi è: " +somma_positivi);
		System.out.println("La somma dei valori negativi è: " +somma_negativi);

	}
}



/*Scrivere un programma SommaPositiviNegativi che chiede all'utente di inserire una se-
quenza di interi terminata quando l'utente immette il valore 0 e poi stampa la somma dei numeri positivi
immessi e la somma dei numeri negativi immessi. Ad esempio, inserendo 2 -1 20 4 -7 3 -1 0 il pro-
gramma stampa 29 e -9. Risolvere questo esercizio senza usare array.*/