import java.util.Scanner;
public class SommaPariDispari {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci una sequenza di numeri: ");
		int n;
		
		//variabili che memorizzano la somma dei pari e die dispari
		int somma_pari = 0;
		int somma_dispari = 0;
		
		do {
			n = input.nextInt();
			//se il numero è pari
			if (n % 2 == 0) {
				somma_pari+=n;
			} else 
				somma_dispari+=n;
			
		} while (n != 0);
	input.close();
	System.out.println("La Somma dei numeri pari è: " +somma_pari);
	System.out.println("La Somma dei numeri pari è: " +somma_dispari);
		
		;
		
		
		
		
		
		
		
		
	}

}
