/*Classe che gestisce le funzionalità da fare su un cc (MAIN -> PUNTO DI PARTENZA DEL PROGRAMMA)*/
public class UsaConto {

	public static void main(String[] args) {
		
		//crea un oggetto contocorrente (con new) che sarà un'istanza della classe contocorrente
		ContoCorrente cc = new ContoCorrente(1000); 
		/*all'interno della classe contocorrente ho un metodo speciale che mi consente di inizializzare 
		 * il cc con un saldo iniziale di 1000 euro */
		
		
		//verso 700 euro con il metodo versa
		cc.versa(700);  //[VERSA = METODO]
		
		
		//faccio due prelievi utilzzando il meotdo preleva e controllando prima il saldo utilizzando un if 
		/*if (cc.saldo > 200) cc.preleva(200); se il saldo è maggiore di 200 euro preleva 200 euro (SALDO = VARIABILE / PRELEVA = METODO)
		if (cc.saldo > 900) cc.preleva(900); se il saldo è maggiore di 900 euro preleva 200 euro*/
		
		//faccio due prelievi utilzzando il meotdo preleva e controllando prima il saldo utilizzando un if 
		if (!cc.preleva(200)) System.out.println("Prelievo fallito");
		
		cc.preleva(900);
		
		
		
		//stampo il saldo finale
		
		System.out.println("Il numero del conto corrente è: " +cc.ottieniNumero());
		System.out.println("Il saldo finale è: "+cc.ottieniSaldo());
		
	}

}


