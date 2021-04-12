/*CLASSE CONTO CORRENTE in cui definisco variabili e metodi che invoco poi nel main usaConto*/
public class ContoCorrente {

	/*VARIABILI*/
	//variabile saldo (var d'istanza)
	//public double saldo; //public -> essendo una variabile dell'intera classe posso sceglkiere se poterla utilizzare solo in quella classe oppure in altre classi 
	
	private double saldo; //private -> evito modifiche esterne al saldo
	
	//varaibile numero -> serve per asegnare un numero identificativo a ogni cc
	private int numero;
	
	//variabile condivisa (modificatore static) -> è la stessa per tutti gli oggetti
	private static int numeroUltimoContoCreato = 1000; //il primo cc ha come numero 1001
	

	/*var tasso (d'istanza) utilizzata per calcolare gli interessi (pubblica per modificarla quando voglio, in accordo con la banca)
	è meglio utilizzare una var statica per non dover calcolare tutte le volte il tasso all'interno dei diversi cc
	*/
	public static double tasso = 0.2; //2% 
	
	
	/*METODI*/
	/*Costruttore della classe 
		metodo speciale che inizializza un nuovo oggetto istanza della classe ContoCorrente*/
		public ContoCorrente(double saldoIniziale ) {
			saldo = saldoIniziale;
			numeroUltimoContoCreato++; //incremento la var condivisa numeroUltimoContoCreato di 1 ottenendo il nuovo numero del cc
			//assegno il numero creato al numero del conto
			numero = numeroUltimoContoCreato;
			
		}
		
	//versa -> metodo che serve per versare soldi nel conto (non restitusice un risultato -> void)
	public void versa (double somma) {
		saldo += somma;
		//traccia i movimenti
		System.out.println("Versati " +somma+ " euro");
	}
	
	public boolean preleva (double somma) {
		if (saldo < somma) return false;
		else {
			saldo -= somma;
			//traccia i movimenti
			System.out.println("Prelevati " +somma+ " euro");
			return true;
		}
	}
		//preleva -> metodo che serve per prelevare soldi dal conto e che restituisce false se il credito no, è sufficiente
			/*public void preleva (double somma) {
				saldo -= somma;
				//traccia i movimenti
				System.out.println("Prelevati " +somma+ " euro");*/
			
		//metodo preleva 2 ->  a differenza del primo, restituisce false se il credito non è sufficiente (ha il return)
		
		//metodo ottieniSaldo -> serve per far leggere al main il saldo
		public double ottieniSaldo() {
			return saldo;
		}
		
		//metodo ottieninumero -> restituisce il numero del cc
		public double ottieniNumero() {
			return numero;
		}
		
		//metodo maturaInteressi -> per calcolare gli interessi in base al tasso
		public void maturaInteressi() {
			saldo += saldo*tasso; //calcolo gli interessi moltiplicando il saldo per il tasso
		}
	}

