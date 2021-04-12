import java.util.Scanner;
public class TuttiUguali2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci 3 numeri: ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int n3 = input.nextInt();
		
		input.close();
		
		controlloUguali(n1, n2, n3);

	}

	public static void controlloUguali(int a, int b, int c) {
		if (a == b && b == c) {
			System.out.println("Tutti uguali!");
		}	
		 else System.out.println("Almeno uno è diverso");
		}	
	}


/*Scrivere un programma "TuttiUguali" che chiede all'utente di inserire tre numeri e
stampa "Tutti uguali!" se i tre numeri sono tutti uguali, e altrimenti stampa "Almeno uno e' diverso".
Il controllo che i tre numeri siano uguali dovra essere fatto da un metodo ausiliario, mentre il messaggio
dovra essere stampato dal metodo main. Il nome del metodo ausiliario puo essere scelto a piacere*/