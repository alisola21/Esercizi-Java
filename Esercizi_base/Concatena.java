import java.util.Scanner;
public class Concatena {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci 3 stringhe: ");
		String s1 = input.next();
		String s2 = input.next();
		String s3 = input.next();
		
		input.close();
		
		System.out.print(concatenazione(s1,s2,s3));
	}
	
	public static String concatenazione(String a, String b, String c) {
		return a + '*' + b + '*' + c;
	}
}

/*Scrivere un programma Concatena che chiede all'utente di inserire tre singole parole e
le ristampa interponendovi un asterisco. Per esempio, se l'utente inserisce "gatto", "cane" e "topo" il
programma stampera gatto*cane*topo. La concatenazione delle tre parole dovra essere fatta utilizzando
un metodo ausiliario che prende due stringhe e restituisce la stringa ottenuta concatenando la prima
parola ricevuta, un asterisco e la seconda parola ricevuta.*/