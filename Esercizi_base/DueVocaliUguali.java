import java.util.Scanner;
public class DueVocaliUguali {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci una stringa: ");
		String s = input.nextLine();
		//var boolena che diventa true se trova una vocale nella stringa 
		boolean vocali = false;
		//int conta_vocali = 0;
		
		//scorro la stringa
		for (int i = 0; i < s.length()-1; i++) {
			//se ci sono le vocali scorro di nuovo l'array
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')  {
			//se trovo una coppia di vocali, la var vocali diventa true
			for (int j = i+1; j < s.length(); j++) {
				if(s.charAt(i) == s.charAt(j)) 
					vocali = true;
				}
			}
		}
		//se ho trovato la coppia di vocali stampo "ci sono vocali" sennò stampo non ci sono vocali
		if (vocali) System.out.println("Ci sono vocali!");
		else System.out.println("Non ci sono vocali");
		
		input.close();
	}

}

/*Scrivere un programma DueVocaliUguali che chiede all'utente di inserire una stringa
e stampa "Ci sono due vocali uguali" se all'interno della stringa c'e' almeno una vocale che compare
piu di una volta (esempi: "ci siamo", "Ciro Rossi", "Vi ci vidi"), altrimenti stampa "NO".*/