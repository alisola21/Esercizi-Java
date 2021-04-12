import java.util.Scanner;
public class TreZeri {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		
		System.out.println("Inserisci una sequenza di interi: ");
		
		int somma = 0;
		int ZeroInseriti = 0;
		
		 
		do {
			int n = input.nextInt();
			somma +=n;
			
			if (n == 0)ZeroInseriti++;
			else ZeroInseriti = 0;
			
			
		} while (ZeroInseriti < 3); 
		
		System.out.println("La somma dei numeri è:" +somma);
		input.close();
	}

}
