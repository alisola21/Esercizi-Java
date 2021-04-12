import java.util.Scanner;
public class ErroreAritmetico {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci due numeri: ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		input.close();
		
		/*cosa succede se y = 0 -> la jvm da errore (java.lang.ArithmeticException: / by zero)
		SOLUZIONE -> DEFINISCO UN GESTORE DI ECCEZIONI CON IL COSTRUTTO TRY-CATCH*/
		try {
			System.out.println(n1/n2);
			System.out.println("CIAO");

		} catch(ArithmeticException e) { //ArithmeticException = tipologia di eccezione che mi dava errore
			/*Se si verifica un eccezione (e) di tipo ArithmeticException
			 * nella divisione il programma non stampa la stringa "CIAO"*/
			
			System.out.println("Non faccio la divisione...");
			
			//gestita l'anomalia riprendo l'esecuzione
		}
		System.out.println("Fine programma: ");
				
		
	}
}
