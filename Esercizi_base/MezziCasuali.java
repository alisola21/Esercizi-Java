import java.util.*; //richiamo la classe util di java che comprende Math
public class MezziCasuali {

	public static void main(String[] args) {
		
		System.out.println(generaCasuale()); 

	}
	
	public static double generaCasuale() {
		//genero un numero casuale con Math.random()
		double risultato = Math.random();
		//se il numero e' maggiore o uguale a 0.5 il metodo lo restituisce diminuito di 0.5
		if (risultato >= 0.5) 
			risultato-= 0.5;
		return risultato; //altrimenti stampa il risultato
	
	}
}

/*Scrivere un programma MezziCasuali che stampa un numero frazionario ottenuto
come risultato della chiamata di un metodo ausiliario che al suo interno richiama il metodo di libre-
ria Math.random(). Se il risultato di Math.random() e minore di 0.5 il metodo lo restituisce cos com'e.
Se invece il risultato di Math.random() e maggiore o uguale a 0.5 il metodo lo restituisce diminuito di
0.5. Il nome del metodo ausiliario puo essere scelto a piacere.*/