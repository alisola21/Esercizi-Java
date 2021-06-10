import java.util.Scanner;
import java.util.InputMismatchException;
public class ErroreFormato {

	public static void main(String[]  args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci un intero: ");
		int x; //numero
		boolean ok; // diventa true se il formato è giusto e false altrimenti
		
		/*cosa succede se inserisco un carattere? -> java.util.InputMismatchException 
		(l'input ha un tipo sbagliato rispetto a quello richiesto da nextInt) */
		
		//GESTORE ERRORI
		do {
			ok = true; //assumo che il valore inserito dall'utente sia corrente
			try {
				x = input.nextInt(); 
				/*operazione che può sollevarmi l'eccezione (è quella che mi può dare errore)
				e per questo devo inserirla nel blocco try*/
				System.out.println(x);
			} catch (InputMismatchException e) {
				input.nextLine(); //annulla l'input ricevuto perché inserisco una stringa
				//se l'utente sbaglia chiedo di reiserire un valore e ok diventa false
				System.out.println("Ritenta inserimento: ");
				ok = false;
			}	
		} while (!ok); //finché ok diventa true (inserisco il carattere giusto)
		
		input.close();
		
		
		
	}
}
