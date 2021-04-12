public class Professore extends Persona {
	
	//VARIABILI
	//private String nome; // nome e cognome
	//private String indirizzo; // indirizzo
	private String codiceDocente; // codice del docente
	private String dipartimento; // dipart.di afferenza
	
	//COSTRUTTORE
	public Professore(String nome, String indirizzo, String codiceDocente, String dipartimento) {
		//this.nome = nome;
		//this.indirizzo = indirizzo;
		super(nome, indirizzo); //richiamo il costruttore di persona passandogli i valori su cui voglio che lavori (nome e indirizzo)
		this.codiceDocente = codiceDocente;
		this.dipartimento = dipartimento;
	}
	
	//METODI
	/* fornisce il nome dello studente
	public String getNome() { return nome ; }
	// fornisce l'indirizzo dello studente
	public String getIndirizzo() { return indirizzo ; }
	// consente di modificare l'indirizzo 
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo ;
	}*/
	// fornisce il codice docente
	public String getCodiceDocente() {
		return codiceDocente;
	}
	// fornisce il dipartimento
	public String getDipartimento() {
		return dipartimento;
	}
	// stampa le informazioni sul professore
	public void visualizza() {
		System.out.println("Nome : Prof."+ getNome());
		System.out.println("Indirizzo : "+ getIndirizzo());
		System.out.println("Codice : "+ codiceDocente );
		System.out.println("Dipartimento : "+ dipartimento );
		System.out.println();
	}
}
