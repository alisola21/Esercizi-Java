import java.util.Scanner;
public class PosizioneMassimo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//var che diventa true  trova il massimo
		
		System.out.println("Inserisci un numero");
		//inserimento di un valore che pensiamo sia il massimo
		int massimo = input.nextInt();
		
		//variavibile che si icrementa ogni volta che troviamo il valore massimo (è inzializzata a 1 perché si comincia a contare da 1)
		int posizione_max = 1;
		//variabile a cui associamo il numero massimo quando scorriamo la sequenza di interi
		int max;
		//boolean max = false;
		
		//scorriamo la sequenza di 10 interi usano un indice i (parto da 2 perché inzio a contare da 1)
		for (int i = 2; i<=10; i++) {
			//inseriamo altri numeri
			System.out.println("Inserisci un numero");
			int n = input.nextInt();
			//se uno dei numeri inseriti è maggiore del valore massimo inserito prima del ciclo
			if (n > massimo) {
				//max = true;
				//alla varaiabile max viene associato quel numero
				max = n;
				//e l'indice di quel numero (ossia la sua posizione) viene asssegnata alla variabile posizione_massimo
				posizione_max = i;
			}
		}
		
		input.close();
		System.out.println("Il valore massimo si trova in posizione "+posizione_max);
			
		
		
	}

}

/*Scrivere un programma PosizioneMassimo che chiede all'utente di inserire una sequenza di
10 interi e poi stampa la posizone nella sequenza del valore massimo inserito (INZIANDO A CONTARE
LE POSIZIONI DA 1). Ad esempio, inserendo 2 -1 20 4 -7 3 -1 13 -2 10 il programma stampa
"valore massimo in posizione 3". Risolvere questo esercizio senza usare array.*/