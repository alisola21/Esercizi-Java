import java.util.Scanner;
public class ripeti2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci una stringa: ");
		String s = input.nextLine();
		
		System.out.println("Inserisci un numero: ");
		int n = input.nextInt();
		
		ripetere(s,n);
		
		input.close();
	}
	
	private static void ripetere(String s, int n) { //void = non c'è bisogno del return
		
		if (n < 0)  //se il numero inserito è negativo stampa errore
				System.out.println("Errore");
		else //altrimenti stampa n copie della stringa
			for (int i = 0; i< s.length(); i++) 
				 System.out.println(s);
	}
}

/*Scrivere un programma Ripeti che chiede all'utente di inserire una stringa e un numero
intero positivo. Entrambe le cose dovranno essere passate a un metodo ausiliario che stampera tante
copie della stringa quante indicate nel numero inserito dall'utente. Se il numero inserito dall'utente e
negativo il metodo ausiliario stampera "ERRORE: numero negativo". Il nome del metodo ausiliario puo
essere scelto a piacere.*/