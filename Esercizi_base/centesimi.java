import java.util.Scanner;
public class centesimi {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci un numero: ");
		int n = input.nextInt();
		
		System.out.println(dividiCento(n));
		input.close();

	}
	
	private static double dividiCento(int n) {
		return((double) n/100);
	}

}
