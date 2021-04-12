import java.util.Scanner;
public class Prefisso {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Inserisci Stringa: ");
		String s = input.nextLine();
		input.close();
		
		//se la stringa è costituita da meno di 3 caratteri stamoa l'intera scritta
		if (s.length()<3) {
			System.out.println(s);
		} 
		//altrimenti stampa i primi 3 caratteri (ciao -> cia)
		else
		System.out.println(estraiprefisso(s));
		}
		
		//metodo ausiliario estraiPrefisso che estrae i primi tre caratteri della stringa s
		private static String estraiprefisso(String stringa) {
			if (stringa.length() > 3) 
				stringa = stringa.substring(0, 3);
			return stringa;
			
		}	

	
}

/*Scrivere un programma Prefisso che chiede all'utente di inserire una stringa e ne stampa
i primi tre caratteri. La stringa ricevuta dall'utente deve essere passata a un metodo ausiliario che ne
estrae la sottostringa costituita dai primi tre caratteri e la restituisce al main. Se la stringa ricevuta
dall'utente e costituita da meno di tre caratteri, essa dovra essere ristampata tale e quale. Il nome del
metodo ausiliario puo essere scelto a piacere.*/