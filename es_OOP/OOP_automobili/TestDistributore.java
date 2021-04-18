
public class TestDistributore {

	public static void main(String[] args) {
		DistributoreBenzina Q8 = new DistributoreBenzina(1.539);
		
		// rifornisco il distributore 
		Q8.rifornisci(200);
		
		//restitusco la quantità di carburante disponibile
		System.out.println("La quantità di carburante disponibile e' " + Q8.getBenzina());
		
		//creo un oggetto Clio della classe car
		Car clio = new Car(10);
		
		// vendo una quantità di benzina corrispondente  all'ammontare di euro pagato e rifornisco l'auto
		Q8.vendi(20, clio);
		
				
		//restituisco il livello di carburante disponibile nella clio
		System.out.println("Il carburante disponibile nell'automobile e'" + clio.getCarburante());
		
		//restituisco il livello di carburante disponibile nel distributore
		System.out.println("La benzina disponibile nel distributore e'" + Q8.getBenzina());
		
		//simulo un percorso di 50 km
		clio.drive(50);
		
		//restituisco il livello di carburante disponibile nella clio
		System.out.println("Dopo il percorso, il carburante disponibile nell'automobile e'" + clio.getCarburante());
		
	
		// aggiorno il prezzo della benzina
		Q8.aggiorna(2.5);
		
	}

}
