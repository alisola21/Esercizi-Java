import java.util.Scanner;
public class Lunghezza {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci una stringa: ");
		String s = input.nextLine();
		
		System.out.println("Inserisci un numero: ");
		int n = input.nextInt();
		
		input.close();
		boolean lunghezza = controllaLunghezza(s, n);
		
		if (lunghezza) 
			System.out.println("SI");
		else
			System.out.println("NO");
	}
	
	private static boolean controllaLunghezza(String s, int n) {
		boolean lenght = false;
		if (s.length() == n) {
			lenght = true; 
		}
			
		return lenght;
	}
}

/*Scrivere un programma Lunghezza che chiede all'utente di inserire una stringa s e un
numero intero n. Il programma stampa "SI" se la lunghezza della stringa e uguale ad n, e stampa
"NO" altrimenti. Il controllo della lunghezza dovrà essere effettuato da un metodo ausiliario che riceve
la stringa e il numero come parametri, e restituisce come risultato il valore di verita (vero o falso) del
controllo. La stampa del messaggio deve invece essere eettuata dal main. Ad esempio, se l'utente
inserisce abcd e 4 il programma dovra stampare SI. Se invece l'utente inserisce abcd e 5 il programma
dovra stampare NO.*/