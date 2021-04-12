import java.util.Scanner;
public class TuttiPositiviNegativi {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		//variabile booleana che se trova un positivo diventa true
		boolean trovato_positivo = false;
		//variabile booleana che se trova un negativo diventa true
		boolean trovato_negativo = false;
		// int cont = 0;
		
		//utilizzo un for perché so quante iterazioni devo fare
		for (int i = 0; i < 10; i++) {
			//sequenza di numeri che deve inserire un utente
			System.out.println("Inserisci una sequenza di numeri");
			int n = input.nextInt();
			
			//se il numero è positivo, alzo la bandierina dei positivi
			if (n >=0) {
				trovato_positivo = true;
				// cont ++ -> variante col contatore
			}
			//se il numero è negativo, alzo la bandierina dei negativi
			else 
				trovato_negativo = true;
				//cont --
		}
		
		if (trovato_positivo && trovato_negativo) {
			//(cont == 10 || cont == 10
			System.out.println("Valori misti");
			
		} else
			System.out.println("Valori tutti positivi o tutti negativi");
		
		input.close();

	}

}

/*Scrivere un programma TuttiPositiviNegativi che chiede all'utente di inserire una se-
quenza di 10 interi e poi stampa "Valori tutti positivi o tutti negativi" se i valori inseriti sono
tutti maggiori o uguali a zero, oppure se sono tutti strettamente minori di zero. In caso contrario (ossia
se ci sono sia valori maggiori o uguali a zero, sia valori negativi) stampa "Valori misti". Risolvere
questo esercizio senza usare array.*/


