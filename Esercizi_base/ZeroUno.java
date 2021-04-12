import java.util.Scanner;
public class ZeroUno {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci un numero: ");
		int n = input.nextInt();
		int n0= 0;
		int n1 = 1;
		 
		
		while (n >= 0) {
			System.out.println("Inserisci un altro numero: ");
			n = input.nextInt();
			n++;
			input.close();
		}
			if (n0 > n1) {
				System.out.println("Vince 0");
				
			}
			else 
				System.out.println("Vince 1");
				
		}
		
	}

