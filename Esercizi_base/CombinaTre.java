import java.util.Scanner;
public class CombinaTre {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci una stringa: ");
		String s = input.nextLine();
		
		System.out.println("Inserisci un'altra stringa: ");
		String s1 = input.nextLine();
		
		input.close();
		
		if ((s.length() < 3) || (s1.length() <3))
			System.out.println("ERRORE");
		else 
			s = s.substring(0, 3);
			s1 = s1.substring(0,3);
			System.out.println(s + s1);
	}

}

/*Scrivere un programma CombinaTre che chiede all'utente di inserire due stringhe e stampa
la stringa ottenuta concatenando i primi tre caratteri della prima stringa con i primi tre caratteri della
seconda. Se una delle due stringhe contiene meno di tre caratteri stampa "ERRORE". Ad esempio,
inserendo "elefante" e "giraffa" il programma stampera "elegir". Inserendo "el" e "giraffa",
oppure "elefante" e "g<" il programma stampera "ERRORE".*/