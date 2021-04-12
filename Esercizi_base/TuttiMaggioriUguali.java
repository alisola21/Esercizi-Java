
public class TuttiMaggioriUguali {

	public static void main(String[] args) {
		
		int valori [] = {2, 7, 9, 21, 76, 5, 10, 34, 67, 43}; 
		boolean maggioriUgualiPrimo = true;
		//scorro l'array e se l'indice è minore del primo elemento dell'array inizializzo la var a true
		for (int i = 0; i<valori.length; i++) {
			if (i<=valori[0]) 
				maggioriUgualiPrimo = false;
			
		}
		//se tutti i valori soo maggiori uguali al primo stampo il messaggio di conferma altrimenti stampo no
		if(maggioriUgualiPrimo)
			System.out.println("tutti maggiori o uguali al primo");	
		else 
			System.out.println("NO!"); 
	}
				
}


/*Scrivere un programma "TuttiMaggioriUguali" che prevede un array di 10 numeri interi
contenente valori a piacere (senza bisogno di chiederli all'utente) e stampa "tutti maggiori o uguali
al primo" se i valori dell'array sono tutti maggiori o uguali al primo (ad esempio: {5, 7, 9, 21, 76, 5,
10, 34, 67, 43} oppure stampa "NO" altrimenti. (Il programma deve essere scritto facendo nta di
non sapere quali siano i valori inseriti nell'array)*/