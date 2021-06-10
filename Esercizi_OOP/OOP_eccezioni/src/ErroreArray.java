
public class ErroreArray {

	public static void main(String[] args) {
		int [] a = {5,3,9,1,2};
		
		for (int i = 0; i < a.length; i++) 
			/*Index 5 out of bounds for length 5 (errore a tempo di esecuzione) 
			 * l'indice dell'array è fuori dai limiti
			 */
			
			//in questi caso non serve un gestore, ma basta correggere il for scrivedo i < a.length invece di a<= a.length
			System.out.println(a[i]);
		
		System.out.println("Ciao");

	}
}
