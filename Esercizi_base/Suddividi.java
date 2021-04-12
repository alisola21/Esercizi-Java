import java.util.Scanner;
public class Suddividi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci una stringa");
		String s = input.nextLine();
		input.close();
		
		int a= 0;
		int b = 0;
		int c = 0;
		//scorro la striga e mi salvo gli spazi nella var spazio
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ')
				c ++;
		}
		int j = 0;
		//while(j == s.equals(" ") && j <s.length()) {
			a= j+1;
			a++;
			c++;
			
		}
		//System.out.println(s.charAt(j));
	}
//}

/*Scrivere un programma Suddividi che chiede all'utente di inserire una frase e la ristampa
una parola per volta. Provare a risolvere questo esercizio impostando un ciclo che fa tante iterazioni
quanti sono gli spazi.*/


