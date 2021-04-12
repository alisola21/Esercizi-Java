import java.util.Scanner;
public class StanpaFino {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//stringa inserita in input dall'utente
		System.out.println("Inserisci una stringa: ");
		String  s = input.nextLine();
		//carattere inserito dall'utente
		System.out.println("Inserisci un carattere: ");
		char c = input.nextLine().charAt(0);
		
		//posizione del carattere all'interno della stringa
		int posizione = s.indexOf(c);
		input.close();
		
		//se il carattere non è presente, stampo l'intera stringa
		if (posizione == -1) {
			System.out.println(s);
			//altrimenti stampo la stringa dall'inizio fino alla posizione del carattere inserito
		} else
			System.out.println(s.substring(0, posizione));
	}
	
}

/*Scrivere un programma StampaFino che chiede all'utente di inserire una stringa e un
carattere, e stampa la porzione di stringa che va dall'inizio no alla prima occorrenza del carattere
inserito (escluso tale carattere). Ad esempio, se l'utente inserisce la stringa "quarantaquattro gatti"
e il carattere 't' il programma deve stampare la porzione di stringa "quaran". Se il carattere inserito
dall'utente non e contenuto nella stringa, il programma dovra stampare l'intera stringa.*/