import java.util.*;
public class Converti {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci un numero frazionario: ");
		double n = input.nextDouble();
		
		System.out.println(parteIntera(n));
		input.close();
	}
	
	private static double parteIntera(double a) {
	
	return (Math.floor(a));
	}
}

/*Scrivere un programma Converti che chiede all'utente di inserire un numero frazionario
(nota: ricordarsi che in Java l'utente deve usare la virgola e non il punto, altrimenti viene segnalato un
errore) e ne stampa la parte intera. Ad esempio, se l'utente inserisce 3,7 il programma deve stampare
3. Per calcolare la parte intera il programma deve usare un medoto ausiliario parteIntera che prende
il numero frazionario come parametro e restituisce il numero intero corrispondente come risultato.*/