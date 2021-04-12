import java.util.Scanner;
public class DueSequenze {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String[] sequenza1 = new String[5];
		String[] sequenza2 = new String[5];
		
		

		for (int i = 0; i<5; i++) {
			System.out.println("inserisci 5 stringhe:");
			sequenza1[i] = input.nextLine();
		}
		
		for (int j =0; j<5; j++) {
			System.out.println("inserisci altre 5 stringhe:");
			sequenza2[j] = input.nextLine();
		}			
		
		int x = 0;
		boolean trovato = false;
		while (x <5 && !trovato) {
		
			int y = 0;
			
			while(y <5 && !trovato) {
			if (sequenza1[x].equals(sequenza2[y]))
				trovato = true;
				y++;
			}
			x++;
		}
		
		if (trovato) System.out.println("OK");
			else System.out.println("NO");
		input.close();
			
		}
	}



/*Scrivere un programma DueSequenze che chiede all'utente di inserire due sequenze di
stringhe, ciascuna di 5 elementi, e poi stampa il messaggio "OK" se almeno una stringa della prima
sequenza compare anche nella seconda, altrimenti stampa il messaggio "NO". Nel caso in cui le due
sequenza abbiano almeno una stringa in comune, i confronti tra le sequenze si devono interrompere non
appena una coppia di stringhe uguali viene trovata.*/