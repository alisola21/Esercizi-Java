
public class DVD implements ProdottoPrezzato {
	
	/*VARIABILI*/
	private String descrizione;
	private static double PREZZO = 19.90;
	
	/*COSTRUTTORE*/
	public DVD(String descrizione) {
		this.descrizione = descrizione;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	
	public double getPrezzo() {
		return PREZZO;
	}
}
