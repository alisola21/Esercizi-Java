import java.util.Scanner;
public class ripeti {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci una stringa: ");
		String s = input.nextLine();
		
		System.out.println("Inserisci un numero: ");
		int n = input.nextInt();
		
		if (n > 0) 
			System.out.println(concatenazione(s, n));
		input.close();
	}
	
	private static String concatenazione(String s, int n) {
		String ris = " ";
		for (int i = 0; i <n; i++) {
			ris+=s;
		}
			
		return ris;
	}

}

/*Scrivere un programma Ripeti che, nel main, chiede all'utente di inserire una stringa s
e numero intero n. Entrambe queste informazioni devono essere passate ad un metodo ausiliario che
restituisce una stringa ottenuta concatenando n copie di s. La stringa restituita deve essere stampata
dal main. Ad esempio, se l'utente inserisce "ciao" e 3 il programma dovra stampare "ciaociaociao".
Se il numero n inserito dall'utente e negativo, il programma non deve stampare nulla.*/