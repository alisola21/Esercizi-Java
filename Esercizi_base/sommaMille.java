import java.util.Scanner;
public class sommaMille {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// numero inserito dall'utente
		
		int n;
		
		//var somma inizializzata a 0
		int somma = 0;
		int contatore = 0;
		
		do {
			System.out.println("Inserisci un numero: ");
			n = input.nextInt();
			somma +=n;
			contatore++;
			
		} while(somma != 1000 && contatore < 10);
		
		if (somma == 1000) System.out.println("Ottenuto 1000");
		
		else System.out.println("Tentativi esauriti");
		input.close();
	}

}

/*Scrivere un programma SommaMille che chiede all'utente di inserire una sequenza di interi
e termina in due casi: quando la somma dei valori inseriti e pari a 1000, oppure quando l'utente ha
inserito 10 numeri. Se la somma dei valori inseriti e pari a 1000 il programma stampa "Ottenuto 1000",
altrimenti stampa "Tentativi esauriti". Ad esempio, inserendo i numeri 180 620 -100 300 il pro-
gramma stampa "Ottenuto 1000", mentre inserendo i numeri 160 140 8 -20 3 -210 4 -11 37 -1 il
programma stampa "Tentativi esauriti".*/