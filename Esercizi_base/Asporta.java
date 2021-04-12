import java.util.Scanner;
public class Asporta {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci una stringa: ");
		String s = input.nextLine();
		
		System.out.println("Inserisci un numero: ");
		int n = input.nextInt();
		
		System.out.println("Inserisci un numero: ");
		int m = input.nextInt();
		input.close();
		
		if (0<=n && n<m && m<s.length()) {
			System.out.println(s.substring(0, n) + s.substring(m, s.length()));
		}
		else
			System.out.println("ERRORE!!!");

	}

}
/*Scrivere un programma Asporta che chiede all'utente di inserire una stringa s e due interi n e m. Entrambi questi valori devono essere maggiori o uguali a 0 e minori della lunghezza della stringa.
Inoltre n deve essere minore di m. Se tutte queste condizioni sono vere, il programma stampa la stringa
ottenuta rimuovendo da s i caratteri che vanno dalla posizione di indice n inclusa alla posizione di indice
m esclusa. In caso contrario il programma stampa "ERRORE!!!". Ad esempio, se l'utente inserisce la
stringa "abcdefg" e i valori 2 e 4, il programma stampa "abefg"*/