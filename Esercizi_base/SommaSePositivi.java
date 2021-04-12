import java.util.Scanner;
public class SommaSePositivi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci una sequenza di numeri: ");
		int n = input.nextInt();
		int somma_positivi = 0;
		boolean negativi = false;
			
		while (n != 0) {
			if (n > 0) 
				somma_positivi +=n;
			else  
				negativi = true;
			n = input.nextInt();
			
		}
		if(! negativi) 
			System.out.println("La somma dei positivi è " +somma_positivi);
		else
			System.out.println("Inserito negativo");
		
		input.close();
	}
	
}


/*Scrivere un programma SommaSePositivi che chiede all'utente di inserire una sequenza di
interi e termina quando l'utente immette il valore 0. Se i numeri inseriti dall'utente sono tutti positivi,
il programma ne stampa la somma. Se invece almeno uno tra i numeri inseriti dall'utente è negativo, il
programma stampa "Inserito negativo". Ad esempio, inserendo i numeri 12 8 10 0 il programma
stampa 30, mentre inserendo i numeri 12 -8 10 0 il programma stampa "Inserito negativo". Risol-
vere questo esercizio senza usare array.*/