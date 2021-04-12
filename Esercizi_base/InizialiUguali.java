import java.util.Scanner;
public class InizialiUguali {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci una stringa: ");
		String s = input.nextLine();
		//var  boolana inizializzata a true
		boolean iniziouguale = true;
		
		//scorro la stringa controllando che siano 10 strighe
		for (int i=1; i<10; i++) {
			//inserisco un'altra stringa e le controllo, richiamando il metodo, che inizino con lo stesso carattere
			System.out.println("Inserisci un'altra stringa: ");
			String s1 = input.nextLine();
			if (!confrontoInizioStringhe(s, s1)) 
				//se le due stringhe non iniziano con lo stesso carattere la var iniziouguale diventa false
				iniziouguale = false;
				
		}
		if (iniziouguale) System.out.println("Le stringhe iniziano tutte con lo stesso carattere");
		else System.out.println("Le stringhe non iniziano tutte con lo stesso carattere");
		input.close();
	}
	
	//metodo ausiliario che controlla che le stringhe inizino cob lo stesso carattere
	
	private static boolean confrontoInizioStringhe(String a, String b) {
		return (a.charAt(0) == b.charAt(0));
		
	}
}
