import java.util.Scanner;

public class SommaProdottoDieci {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci '1' per la somma o '2' per il prodotto: ");
        int scelta = input.nextInt();

        if(scelta == 1) {
            int risultato = somma10();
            System.out.println(risultato);
        }
        else if (scelta == 2) {
            int risultato = prodotto10();
            System.out.println(risultato);
        }
        else 
            System.out.println("ERRORE: Hai inserito un carattere errato");
        
        input.close();
    }

    // metodo ausiliario somma10
    private static int somma10() {
        int risult = 0;
        for(int i = 1; i <=10; i++) {
            risult += i;
        }
        return risult;
    }

    // metodo ausiliario prodotto10
    private static int prodotto10() {
        int risult = 1;
        for(int i = 1; i <=10; i++) {
            risult *= i;
        }
        return risult;
    }
}
