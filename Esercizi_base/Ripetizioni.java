import java.util.Scanner;
public class Ripetizioni {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Quanti caratteri vuoi inserire? ");
			int caratteri_inseriti = input.nextInt();
			
			for (int j = 0; j < caratteri_inseriti; j++) {
				char a = input.next().charAt(0);
				System.out.println(a);
			}
		}
		input.close();
	}

}

/*Scrivere un programma Ripetizioni che chiede all'utente di inserire una sequenza di
caratteri (chiedendo prima quanti caratteri voglia inserire) e li ristampa man mano che vengono inseriti.
L'intero procedimento (chiedere quanti caratteri voglia inserire, leggere i caratteri e man mano stamparli)
dovra essere ripetuto 5 volte. Risolvere questo esercizio senza usare array.*/