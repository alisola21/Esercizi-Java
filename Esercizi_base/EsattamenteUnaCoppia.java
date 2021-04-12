
public class EsattamenteUnaCoppia {

	public static void main(String[] args) {
		int array[] = {8, 4, 11, 5, 6, 9, 4, -2, 33, 6};
		
		//var che diventa true ogni volta che si trova una coppia di elementi uguali
		boolean coppia = false;
		
		//scorro l'array utilizzando due indici
		for (int i = 0; i<array.length-1; i++) {
			for (int j = i+1; j<array.length; j++) {
				//se l'elemento in posizione i è uguale all'elemento in posizione j
				if (array[i] == array[j]) 
					//la var coppia diventa true;
					coppia = true;
			}
		}
		
		if (coppia) System.out.println("Esattamente una coppia");
	}

}

/*Scrivere un programma "EsattamenteUnaCoppia" che prevede un array di 10 numeri
interi contenente valori a piacere (senza chiederli all'utente) e stampa "Esattamente una coppia" se,
considerando tutte le possibili coppie di elementi dell'array, ce n'e esattamente una costituita da due valori
uguali (ossia, l'array contiene due valori uguali tra loro e tutti gli altri sono diversi). Ad esempio, il pro-
gramma stampa "Esattamente una coppia" nel caso in cui l'utente inserisca "8 4 11 5 7 9 4 -2 33 -8"
(coppia di 4) e non stampa nessun messaggio nei casi "8 4 11 5 -14 23 71 -33 10 41" (tutti diversi),
"8 4 11 5 4 23 71 -33 10 4" (tre elementi uguali) e "8 4 11 5 4 23 71 -33 10 11" (piu di una
coppia)*/