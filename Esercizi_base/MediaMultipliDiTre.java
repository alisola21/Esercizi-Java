import java.util.Scanner;
public class MediaMultipliDiTre {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quanti numeri vuoi inserire?");
		int numeri_inseriti = input.nextInt();
		int somma = 0;
		int conta = 0;
		
		for (int i = 0; i < numeri_inseriti; i++) {
			System.out.println("Inserisci un numero");
			int n = input.nextInt();
			if (n % 3 == 0) 
				somma+=n;
				conta++;
		} 
		input.close();
		int media = somma/conta;
		System.out.println("La media dei multipli di tre e': " +media);
	}
	

}

/*Scrivere un programma MediaMultipliDiTre che chiede all'utente di inserire una se-
quenza di interi (chiedendo prima quanti numeri voglia inserire) e poi stampa la media di tutti i numeri
inseriti che siano divisibili per tre. Per esempio, se si immettono i valori 5, 8, 9, 12, 7, 6 ,1 il
risultato stampato dovra essere 9. Risolvere questo esercizio senza usare array.*/