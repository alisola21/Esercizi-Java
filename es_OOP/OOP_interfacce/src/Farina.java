
public class Farina implements ProdottoPrezzato, ProdottoPesabile {
	
	/*VARIABILI*/
	private double prezzoKg;
	private double peso = 0.0;
	
	/*COSTRUTTORE*/
	public Farina (double prezzoKg) {
		this.prezzoKg = prezzoKg;
	}
	
	/*METODI*/
	//restituisce la descrizione del prodotto
	public String getDescrizione() {
		return "Farina ";
	}
	
	//calcola il peso della farina
	public void setPeso(double peso) {
		if (peso > 0) this.peso = peso;
	}
	
	//calcola il prezzo della farina
	public double getPrezzo() {
		return prezzoKg * peso;
	}
}
