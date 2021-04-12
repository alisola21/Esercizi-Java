
public class TuttiUguali {

	public static void main(String[] args) {
		int[] valori = {8,8,8,8,8,8,8,8,8};
		
		boolean uguali = true;
		//per ogni elemento dell'array  dell'array 
		for (int x: valori) {
				//se l'elemento x è diverso dal primo elemento
				if (x!= valori[0]) 
					//la variabile uguali diventa false
					uguali = false;
			}
		
		if (uguali) 
			System.out.println("Tutti uguali!");
		else System.out.println("Non tutti uguali");
		

	}

}
