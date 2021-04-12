import java.util.Scanner;
public class FunzionariOrdinati {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Inserisci 3 numeri");
		double n1 = input.nextDouble();
		double n2 = input.nextDouble();
		double n3 = input.nextDouble();
		input.close();
		//se ii 3 numeri sono disposti in ordine crescente (= true)
		if (controllo(n1, n2,n3))
			System.out.println("Frazionari ordinari");
		else 
			System.out.println("Frazionari non ordinati");
	}
	//boolean = tipo di risultato
	private static boolean controllo(double a, double b, double c) {
		if ((a < b) && (b<c) || (a > b) && (b > c)) //nel caso in cui i numeri sono ordinati in ordine crescente (a < b) && (b<c)  o in ordine decrescente (a > b) && (b > c) restituisco true;
			return true;
		else return false;
	}
}

/*Scrivere un programma FrazionariOrdinati che chiede all'utente di inserire tre numeri
frazionari e stampa "Frazionari ordinati" se i tre numeri con la virgola sono stati inseriti in ordine
crescente oppure decrescente. Se i numeri non sono ne in ordine crescente, ne decrescente, il programma
stampa "Frazionari non ordinati". Il controllo che i numeri siano stati inseriti in maniera ordinata
deve essere fatto da un metodo ausiliario che riceve i tre numeri come parametri. La stampa del messaggio
deve essere invece eseguita dal main. Il nome del metodo ausiliario puo essere scelto a piacere.*/