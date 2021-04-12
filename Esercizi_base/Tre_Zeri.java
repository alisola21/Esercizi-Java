import java.util.Scanner;
public class Tre_Zeri {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		int n;
		
		int somma = 0;
		int zeroInseriti = 0;
		
		do {
			System.out.println("Inserisci un numero: ");
			n = input.nextInt();
			somma +=n;
			
			if (n == 0) zeroInseriti++;
			else zeroInseriti = 0;
				
		} while(zeroInseriti < 3);
		
		System.out.println("La somma dei numeri inseriti e': " +somma);
		input.close();
	}

}

/*Scrivere un programma TreZeri che chiede all’utente di inserire una sequenza di interi 
 * e termina quando l’utente immette tre zeri consecutivi. 
 * Alla fine il programma dovrà stampare la somma di tutti i numeri inseriti. 
 * Ad esempio, inserendo i numeri 3 5 0 0 1 4 0 -8 0 9 -2 0 0 0 il programma stampa 12.*/
 