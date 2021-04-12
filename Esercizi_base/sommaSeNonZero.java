import java.util.Scanner;
public class sommaSeNonZero {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci una sequenza di interi: ");
		int n = input.nextInt();
		int somma = 0;
		boolean trovato = false;
		
		while (n >= 0) {
			n = input.nextInt();
			if(n != 0) somma += n;
				
			if(n == 0)  trovato = true;
			
		}
		
		if(trovato) 
			System.out.println("Inserito zero");
		else 
			System.out.println("La somma e': " +somma);
		
		input.close();
		
		}
	}



/*Scrivere un programma SommaSeNonZero che chiede all'utente di inserire una sequenza di
interi e termina quando l'utente immette un valore negativo. Se i numeri inseriti dall'utente sono tutti
diversi da zero, il programma ne stampa la somma. Se invece almeno uno tra i numeri inseriti dall'utente e
zero, il programma stampa "Inserito zero". Ad esempio, inserendo i numeri 12 8 10 -1 il programma
stampa 30, mentre inserendo i numeri 12 0 10 -1 il programma stampa "Inserito zero". Risolvere
questo esercizio senza usare array.*/