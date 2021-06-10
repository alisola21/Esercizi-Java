
public class TestCellulare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creo un oggetto cellulare con 12 euro di credito e 0 minuti di chiamate 
		Cellulare iphone = new Cellulare(12.0, 0);
		
		//ricarico il cellulare di 20 euro
		iphone.ricarica(20.0);
		
		//effettuo una chiamata di 5 minuti
		iphone.chiama(5);
	
		//stampo il credito disponibile e il numero di chiamate
		System.out.println("Il credito disponibili e' " + iphone.chiama404());
		System.out.println("Il numero di chiamate disponibili e' "+ iphone.getNumeroChiamate());
		
		//infine, azzero le chiamate
		iphone.azzeraChiamate();
		
		//e stampo nuovamente il num di chiamate disponibili
		System.out.println("Il nuovo numero di chiamate disponibili e' "+ iphone.getNumeroChiamate());
	}

}
