import java.util.Scanner;
public class Inciso {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Inserisci una stringa: ");
		String s = input.nextLine();
		
		int virgola = 0;
		int virgola1 = 0;
		//int i = 0;
		
		/*while(i < s.length()) {
			if (s.charAt(i) == ',')
				virgola++;
			
		}*/
		
		for (int i = 0; i <s.length(); i++) {
			if (s.charAt(i) == ',')
				virgola++;
			
			for (int j = i; j<s.length(); j++) {
				 if (s.charAt(j) == ',')
					 virgola1++;
			}
			
			System.out.println(s.substring(virgola));
		}
		
		
		input.close();
	}

}
