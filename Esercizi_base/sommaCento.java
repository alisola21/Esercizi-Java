import java.util.Scanner;
public class sommaCento {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n;
		int somma = 0;
		int contatore = 0;
		
		do {
			System.out.println("Inserisci un numero :");
			n = input.nextInt();
			somma+=n;
			contatore++;
		} while (somma != 100 && contatore <10);
		
		if (somma == 100) System.out.println("Ottenuto 100");
		else System.out.println("Tentativi esauriti");
		input.close();
	}
	

}
