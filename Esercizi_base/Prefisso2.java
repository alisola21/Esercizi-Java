import java.util.Scanner;
public class Prefisso2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci una stringa:");
		String s = input.nextLine();
		input.close();
		if (s.length()<4) 
			System.out.println(s);
		else 
			System.out.println(estraiprefisso(s));
	}
	
	private static String estraiprefisso(String stringa) {
		if (stringa.length()>4)
			stringa = stringa.substring(0, 4);
		return stringa;
	}

}
