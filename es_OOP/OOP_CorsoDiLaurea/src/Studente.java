public class Studente extends Persona {
	
	//private String nome ; // nome e cognome
	//private String indirizzo ; // indirizzo dello studente
	private int matricola ; // numero di matricola
	private int anno ; // anno di frequentazione
	
	// variabile statica -> da usare per creara la matricola ogni volta che creiamo un nuov studente
	private static int ultimaMatricola = 0; 
		
	//COSTRUTTORE -> ogni volta che uno studente si immatricola, prende il nome e l'indirizzo dello studente
	public Studente(String nome, String indirizzo ) {
		//this.nome = nome ; //this = variabile d'istanza
		//this.indirizzo = indirizzo ;
		super(nome, indirizzo); //richiamo il costruttore di persona passandogli i valori su cui voglio che lavori
		
		// genera la matricola usando la variabile statica
		this.matricola = ultimaMatricola + 1;
		ultimaMatricola ++;
		
		// si assume che un nuovo studente sia al primo anno
		this.anno = 1;
	}
	//METODI
	/*fornisce il nome dello studente
	public String getNome() { return nome ; }
	// fornisce l'indirizzo dello studente
	public String getIndirizzo() { return indirizzo ; }
	
	// consente di modificare l'indirizzo 
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo ;
	}*/ 
	// fornisce la matricola
	public int getMatricola() { return matricola ; }
	
	// fornisce l'anno di frequentazione
	public int getAnno() { return anno ; }
	
	// modifica l'anno di frequentazione
	public void setAnno(int anno) {
		if(anno >0) this.anno = anno ;
		}
		// verifica se lo studente e' fuoricorso
		public boolean isFuoricorso() { return(anno >5); }
		// stampa le informazioni sullo studente
		public void visualizza() {
			System.out.println("Nome : "+ getNome()); // richiamo il metodo getNome della classe Persona
			System.out.println("Indirizzo : "+ getIndirizzo()); // richiamo il metodo getIndirizzo della classe Persona
			System.out.println("Matricola : "+ matricola);
			System.out.println("Anno : "+ anno);
			if(isFuoricorso())
				System.out.println("(Studente fuoricorso )");
			else
			System.out.println("(Studente in corso )");
			System.out.println();
		}
	}

