
public class test_dado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creo un oggetto dado
		dado d_1 =  new dado(6);
		
		//Riduco il numero delle facce a 5
		d_1.setFacce(5);
		
		//Eseguo il lancio
		System.out.println("Il risultato del lancio e': " +d_1.lancio());;
	}

}
