import java.util.Scanner;
public class SommaOpzionale {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n;
		int somma = 0;
		int numeroNegativi = 0;
		boolean sommaPositivi = false;
		
		for (int i = 0; i<10; i++) {
			System.out.println("Inserisci un numero :");
			n = input.nextInt();
			if (n > 0)  {
				somma+= n;
				sommaPositivi = true;
			} else
				numeroNegativi=n;
				numeroNegativi++;
		}
		
		if (sommaPositivi) {
			System.out.println(somma);
		} else System.out.println(numeroNegativi);
		input.close();
		
	}

}

/*Scrivere un programma SommaOpzionale che chiede all'utente di inserire 10 numeri interi. 
 * Se i numeri sono tutti positivi, il programma ne stampa la somma. 
 * Altrimenti il programma stampa il numero dei numeri negativi inseriti. A
 * d esempio, se l'utente inserisce 2 3 2 3 2 3 2 3 2 3 il programma stampa 25. 
 * Se invece l'utente inserisce 2 -3 2 3 2 -3 2 3 -1 4 il programma stampa 3.
 */
