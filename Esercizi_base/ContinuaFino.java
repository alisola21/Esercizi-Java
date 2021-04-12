import java.util.Scanner;
public class ContinuaFino {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		boolean valido;
		int somma = 0;

		do {
			System.out.println("Inserisci un altro numero: ");
			int n = input.nextInt();
			valido  = (n <0 && n%2==0) || (n > 0 && n % 3 == 0);
			if (valido)
				somma +=n;
		} while (valido);
		
		System.out.println(somma);
		input.close();
	}
}
