
public class Car {
	
	/*VARIABILI*/
	public double carburante;
	public double resa_carburante;
	
	
	/*COSTRUTTORE*/
	//oggetto car con resa del carburante misurata in km/L e un livello di carburante = 0 
	public Car(double kmL) {
		resa_carburante = kmL;
		carburante = 0;
	}
	
	/*METODI*/
	//simula il percorso di un'auto x una certa distanza
	public void drive(int km_percorsi) {
		carburante = carburante - (km_percorsi/resa_carburante);
	}
	
	//restituise il livello corrente di carburante
	public double getCarburante() {
		return carburante;
	}
	
	// fa rifornimento utilizzando una var rifornimento
	public void rifornimento(double rifornimento) {
		carburante = carburante + rifornimento;
	}
}

/*Progettare e realizzare una classe Car(automobile) con le proprietà seguenti. 
 * Un’automobile ha una determinata resa del carburante (misurata in miglia/galloni o in litri/chilometri: 
 * scegliete il sistema che preferite) e una certa quantità di carburante nel serbatoio. 
 * La resa è specificata dal costruttore e il livello iniziale del carburante è a zero. 
 * Fornire questi metodi: 
 * 	un metodo drive -> simulare il percorso di un’automobile per una certa distanza, 
 * riducendo il livello di carburante nel serbatoio; 
 * un metodo getGas, -> ispezionare il livello corrente del carburante; 
 *un metodo addGas -> far rifornimento.*/