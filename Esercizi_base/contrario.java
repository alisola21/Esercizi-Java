import java.util.Scanner;
public class contrario {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci una stringa: ");
		String s = input.nextLine();
		
		//scorro la stringa al contrario e la stampo
		for (int i  = s.length()-1; i>=0;  i--) {
			System.out.print(s.charAt(i));
		}
		input.close();
	}

}

/*Scrivere un programma Contrario che chiede all'utente di inserire una stringa e la
stampa al contrario. Per esempio, se si immette la stringa "Viva Java", il programma stampa "avaJ aviV"*/