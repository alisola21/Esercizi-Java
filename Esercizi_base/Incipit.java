import java.util.Scanner;
public class Incipit {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci una stringa: ");
		String s = input.nextLine();
		
		System.out.println("Inserisci un numero: ");
		int n = input.nextInt();
		
		if ((n<0) || (n>s.length()))
		      System.out.println("ERRORE");
		    else
		      System.out.println(s.substring(0,n));
		
		input.close();
	}

}

/*Scrivere un programma Incipit che chiede all'utente di inserire una stringa e un numero
intero n, e stampa i primi n caratteri della stringa inserita. Se n e un valore negativo o maggiore della
lunghezza della stringa deve essere invece stampato un messaggio di errore.*/