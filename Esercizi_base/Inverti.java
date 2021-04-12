import java.util.Scanner;
public class Inverti {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci una stringa: ");
		String s = input.nextLine();
		
		int i = 0;
		//se la stringa contiene un carattere di spazio
		if (s.charAt(i) == ' ') {
			//estraggo la sottostringa e la metto in fondo
				System.out.println(s + s.substring(0, s.charAt(i)));
			} else
				System.out.println(s);
		}	
	}



/*Scrivere un programma Inverti che chiede all'utente di inserire una stringa di testo. 
 * Il programma stampa il risultato ottenuto spostando la prima parola del testo (che va dall'inizio fino al primo carattere spazio) 
 * in fondo alla stringa. Se il testo inserito dall'utente non contiene caratteri di spazio, il programma lo stampa sullo schermo così 
 * come inserito dall'utente. 
 * Ad esempio, se l'utente inserisce il testo "oggi va tutto bene" il programma stampa "va tutto bene oggi". 
 * Se invece l'utente inserisce il testo "ciao" il programma stampa "ciao". 
 * Fare attenzione a disporre correttamente gli spazi nello spostare la prima parola in fondo.*/
 