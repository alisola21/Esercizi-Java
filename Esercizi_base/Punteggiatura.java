import java.util.Scanner;
public class Punteggiatura {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci una stringa: ");
		String s = input.nextLine();
		
		//var che conta i caratteri delle stringhe con la punteggiatura
		int conta = 0;
			
		//finche' s è diversa dalla stringa vuota
		do {
			System.out.println("Inserisci un'altra stringa: ");
			s = input.nextLine();
			//scorro la stringa
			for (int i = 0; i <s.length(); i++) {
				//dopo di che controllo i vari casi di punteggiatura utilizzando lo switch e incremento al variabile contatore
				switch(s.charAt(i)) {
					case '.': case ',': case ';': case ':': case '!':case '?':
					conta ++; 
					break;
					}
				}
			} while (!s.isEmpty());
			
			System.out.println(conta);
			input.close();
			
		}
	}


/*Scrivere un programma Punteggiatura che chiede all'utente di inserire una sequenza
di stringhe conclusa dalla stringa vuota e poi stampa il numero di caratteri di punteggiatura (.,;:!?)
in esse contenuti. Per esempio, se si immettono le stringhe "Albero.", "foglia, radice, fiore",
"tronco: cavo", "ramo!", "Frutto" (e poi "" per nire), il programma stampa 5*/