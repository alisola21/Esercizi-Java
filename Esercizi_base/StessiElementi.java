
public class StessiElementi {

	public static void main(String[] args) {
		int array1 [] = {4,5,2,3,1};
		int array2 [] = {6,2,3,7,5};
		
		int somma = 0;
		//per ogni elemento del primo e del secondo array
		for (int x: array1) {
			for (int y: array2) {
				//se l'elemento x (array1) è uguale all'elemento y(array2)
				if (x == y) 
					//somma gli elementi del primo array
						somma +=x;
			}
		}
		System.out.println("La somma degli stessi elementi contenuti nei due array é: " +somma);
	}

}

/*Scrivere un programma "StessiElementi" che prevede due array di 5 numeri interi cias-
cuno contenente valori a piacere (senza bisogno di chiederli all'utente) e che sono tra loro TUTTI DI-
VERSI. Il programma stampa la somma degli elementi del primo array che sono contenuti anche nel
secondo array (ad esempio: con {4, 5, 2, 3, 1} e {6, 2, 3, 7, 5} stampa 10). (Il programma deve
essere scritto facendo nta di non sapere quali siano i valori inseriti nei due array)*/