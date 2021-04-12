import java.util.Scanner;
public class InziaconA {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci una stringa: ");
		String s = input.nextLine();
		
		if (controllaCarattere(s, 'a') || controllaCarattere(s, 'A')) 
			System.out.println("SI");
		else
			System.out.println("NO");
		
		input.close();

	}
	
	private static boolean controllaCarattere(String s, char c) {
		boolean ok = false;
		if (s.charAt(0) == c)
			ok = true;
		return ok;
	}
	
}

/*Scrivere un programma IniziaConA che chiede all�utente di inserire una stringa s e stampa SI se tale stringa inizia con il carattere �a�, oppure con il carattere �A�. 
 * Il programma stampa NO altrimenti. Il controllo del primo carattere dovr� essere effettuato da un metodo ausiliario che riceve la stringa e un carattere come parametri, 
 * e restituisce come risultato il valore di verit� (vero o falso) del controllo. 
 * Tale metodo dovr� essere richiamato due volte dal main: una volta passandogli il carattere �a�, e la seconda volta il carattere �A�. 
 * La stampa del messaggio deve invece essere effettuata dal main. Ad esempio, se l�utente inserisce abcd oppure ABCD il programma dovr� stampare SI. 
 * Se invece l�utente inserisce dcba il programma dovr� stampare NO.*/
 