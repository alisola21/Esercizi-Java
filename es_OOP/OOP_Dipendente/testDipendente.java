
public class testDipendente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// crea un oggetto dipendente
		Dipendente dipendente = new Dipendente();
		
		dipendente.setNome("Alice");
		dipendente.setStipendio(1800.50);
		
		
		//restituisce il nome del dipendente
		System.out.println("Il nome del dipendente e' " + dipendente.getNome());
		
		//restituisce il valore dello stipendio
		System.out.println("Lo stipendio del dipendente e' " + dipendente.getStipendio());
		
		//cambia il nome del dipendente
		dipendente.setNome("Marco");
		
		// e stampa il nuovo nome 
		System.out.println("Il nuovo nome del dipendente e' " + dipendente.getNome());
		
		//cambia il valore dello stipendio
		dipendente.setStipendio(1700.30);
		
		// e stampa il nuovo nome 
		System.out.println("Il nuovo nome del dipendente e' " + dipendente.getStipendio());
		
		//incrementa il valore dello stipendio del 20%
		dipendente.aumento(20.0);
		
		System.out.println("Il valore dello stipendio aumentato e' "+ dipendente.getStipendio());
		
		
	}
	

}
