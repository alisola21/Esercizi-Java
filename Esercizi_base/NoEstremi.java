import java.util.Scanner;
public class NoEstremi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci una stringa");
		String s = input.nextLine();
		
		//scorro la stringa
		
		if (s.length() > 3) 
			System.out.println(s.substring(1, s.length()-1));
		
	}

}

/*Scrivere un programma EstremiEsclusi che chiede all’utente di inserire una stringa e stampa la stringa 
 * stessa a meno del primo e dell’ultimo carattere. 
 * Se la stringa contiene meno di tre caratteri il programma non stampa nulla. 
 * Ad esempio, inserendo gatto il programma stampa att. 
 * Inserendo invece re il programma non stampa nulla*/
