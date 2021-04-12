import java.util.Scanner;
public class soloVocali {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		
		System.out.println("Inserisci una Stringa");
		String s = input.nextLine();
		
		for (int i = 0; i<s.length(); i++) {
			char c = s.charAt(i);
			
			switch(c) {
			case 'a': 
			case 'e': 
			case 'i': 
			case 'o': 
			case 'u': 
			case 'A': 
			case 'E': 
			case 'I': 
			case 'O': 
			case 'U': 
				System.out.print(c); break;
			}
			
			/*if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || 
					s.charAt(i) == 'o' || s.charAt(i) == 'u' ) {
				vocali = s.charAt(i);
				System.out.print(vocali);
			}*/
		}
		input.close();
		
	}

}

/*Scrivere un programma SoloVocali che chiede all'utente di inserire una stringa e ne
stampa le sole vocali. Per esempio, se si immette la stringa "Viva Java", il programma stampa "iaaa".*/