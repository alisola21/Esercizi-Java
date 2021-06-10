
public class TestCar {

	public static void main(String[] args) {
		//creo un oggetto Panda di tipo car
		Car panda = new Car(10);
		
		//faccio rifornimento di 20 euro nella Panda 
		panda.rifornimento(20);
		
		//restituisco il livello di carburante
		System.out.println("Il carburante disponibile e'" + panda.getCarburante());
		
		//simulo un percorso di 100 km
		panda.drive(100);
		
		//restituisco il livello di carburante
		System.out.println("Dopo il percorso, il carburante disponibile e'" + panda.getCarburante());
		

	}

}
