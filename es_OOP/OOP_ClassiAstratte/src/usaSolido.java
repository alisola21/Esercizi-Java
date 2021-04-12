import java.util.Scanner;
public class usaSolido {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Vuoi creare una sfera o un cubo?");
		char scelta = input.nextLine().charAt(0);
		
		if (scelta == 's' || scelta == 'c') {
			//definisco il peso specifico
			System.out.println("Inserisci il peso specifico: ");
			double ps = input.nextDouble();
			
			//creo un oggetto di tipo solido
			Solido sol;
			
			if (scelta == 's') { // nel caso in cui hai scelto una sfera (s)
				//inserisco il raggio
				System.out.println("Inserisci il valore del raggio: ");
				double raggio = input.nextDouble();
				//creo un oggetto Sfera
				sol = new Sfera(raggio, ps);
			
			} else { //nel caso in cui hai scelto il cubo (c)
				//insierisco il lato 
				System.out.println("Inserisci il valore del lato: ");
				double lato = input.nextDouble();
				//creo un cubo
				sol = new Cubo(lato, ps);
		}		
		input.close(); 
		System.out.println("Hai creato un solido " + sol +
							" con volume " + sol.volume() +
							" e peso "   + sol.peso()); 
		}
	}

}
