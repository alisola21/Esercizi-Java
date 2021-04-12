import java.util.Scanner;
public class PositivoNegativo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci un numero");
		int n = input.nextInt();
		//var booleana che quando trova un valore positivo seguito da uno negativo diventa true
		boolean trovato = false;
		
		while (n != 0) {
			int precedente = n;
			System.out.println("Inserisci un altro numero");
			n = input.nextInt();
			if (precedente > 0 && n < 0) 
				trovato = true;
			
		} 
		if (trovato) System.out.println("OK");
		else System.out.println("NO");
		input.close();
	}

}
