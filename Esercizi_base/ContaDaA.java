import java.util.Scanner;
public class ContaDaA {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci due numeri");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		
		
		if (seguenti(n1, n2) == false) 
			System.out.println("Numeri errati");

	}
	
	private static boolean seguenti(int a, int b) {
		boolean stampaSeguenti;
		System.out.print(a +(a-1));
		stampaSeguenti = true;
		return stampaSeguenti;
		
	}

}

/*S/*Scrivere un programma ContaDaA che chiede all'utente di inserire due numeri interi e stampa tutti i numeri che vanno dal 
 * primo numero inserito al secondo. Ad esempio, se l'utente inserisce 8 e 12 il programma stampa 8 9 10 11 12 
 * (uno accanto all'altro o uno sotto l'altro, a scelta). Se il primo numero inserito è strettamente maggiore del secondo 
 * (ad esempio se l'utente inserisce 12 e 8), il programma stampa "numeri errati". La stampa dei numeri deve essere effettuata 
 * da un metodo ausiliario che riceve i due numeri come parametro, effettua la stampa e restituisce true o false a seconda che 
 * la stampa sia stata effettuata oppure no. Il messaggio "numeri errati" deve essere invece stampato dal main sulla base del 
 * risultato restituito dal metodo ausiliario. 
 * Il nome del metodo ausiliario può essere scelto a piacere.*/
