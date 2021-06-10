import java.util.Random;

public class ArrayCasuale {
    public static void main(String[] args) {
        // genero un array di 10 numeri (con valori casuali compresi tra 0 e 100) con il metodo generaArray()
        int [] numeri = generaArray(10);
        //sommo questi 2 numeri con il metodo sommaArray();
        System.out.println("La somma degli elementi dell'array e'" + sommaArray(numeri));
    }

    private static int[] generaArray(int n) {
        int [] risultato = new int[n];//creo l'array risultato 
        Random numeriCasuali = new Random(); // genero un certo numero di num casuali
        for (int i = 0; i < n ; i++) {
            //scorro l'array e assegno a ciascun valore un numero casuale compreso tra 0 e 100
            risultato[i] = numeriCasuali.nextInt(100); 
        }
        return risultato; //restituisco l'array
    }
    private static int sommaArray(int[] a) {
        int somma = 0;
        for(int i: a)  //per ogni elemento dell'array eseguo la somma
            somma += i;
        return somma; //resituisco la somma
    }

}
