import java.util.Scanner;
public class AttaccaCaratteri {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci tre caratteri");
		
		String a = input.next();
		String b = input.next();
		String c = input.next();
		
		System.out.print(StampaCaratteri(a,b,c));
		input.close();
	}
	
	private static String StampaCaratteri(String a, String b, String c) {
		return (a+b+c);
	}
}