import java.util.Scanner;
public class millesimi {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//numero da far inserire all'utente
		System.out.println("Inserisci un numero: ");
		int n = input.nextInt();
		 
		System.out.println(frazionario(n));
		input.close();
	}
	
	//metodo ausiliario che restituisce la divisione del numero x mille
	private static double frazionario(int n) {
		return ((double) n/1000);
	}
}

/*Scrivere un programma Millesimi che chiede all'utente di inserire un numero intero e
stampa il numero frazionario ottenuto dalla divisione (senza approssimazione) di tale numero per 1000.
La divisione dovra essere eettuata da un metodo ausiliario che riceve il numero intero come parametro e
restituisce il risultato della divisione per 1000. La stampa del risultato dovra essere eettuata dal main.*/
