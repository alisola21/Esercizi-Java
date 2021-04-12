
public abstract class Solido { //classe astratta (abstact)
	/*VARIABILI*/
	private double pesoSpecifico;
	
	/*COSTRUTTORE*/
	public Solido(double ps) {
		pesoSpecifico = ps;
	}
	
	
	/*METODI (ASTRATTI)*/
	public double peso() { //il metodo peso richiama volume anche se non è stato implementato
		return volume()*pesoSpecifico;
	}
	
	public abstract double volume();
	
	public abstract double superficie();
}
