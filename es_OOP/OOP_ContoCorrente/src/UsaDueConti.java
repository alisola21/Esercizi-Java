public class UsaDueConti {
 
	public static void main(String[] args) {
		
		//tasso dei cc -> riferisco la var tasso (var statica) all'intera classe ContoCorrente
		ContoCorrente.tasso += 0.1;		
		
		//creo un nuovo cc inizializzato a 1000
		ContoCorrente cc1 = new ContoCorrente(1000); //il secondo parametro è il num del conto
		
		//creo un nuovo cc inizializzato a 200
		ContoCorrente cc2 = new ContoCorrente(200);
		
		//creo un terzo cc vuoto
		ContoCorrente cc3 = new ContoCorrente(0);
		
		//prelevo 700 euro dal primo conto (cc1)
		cc1.preleva(700);
		
		//verso 500 nel terzo conto (cc3)
		cc3.versa(400);
		
		//200 nel secondo cc (cc2)
		cc2.versa(300);
		
		
		//stampo il saldo finale dei due cc 
		System.out.println("Il numero del conto é " +cc1.ottieniNumero());
		System.out.println("Il saldo finale del primo conto corrente è: " +cc1.ottieniSaldo());
		System.out.println();
		System.out.println("Il numero del conto é " +cc2.ottieniNumero());
		System.out.println("Il saldo finale del secondo conto corrente è: " +cc2.ottieniSaldo());
		System.out.println();
		System.out.println("Il numero del conto é " +cc3.ottieniNumero());
		System.out.println("Il saldo finale del terzo conto corrente è: " +cc3.ottieniSaldo());
	}
}
