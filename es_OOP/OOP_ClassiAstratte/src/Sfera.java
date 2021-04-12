public class Sfera extends Solido {
	
	/*VARIABILI*/
	private double raggio ;
    //private double pesoSpecifico ;
    
	/*COSTRUTTORE*/
	public Sfera(double raggio , double ps) {
        super(ps); // il peso specifico viene ereditato dalla super classe con il metodo super()
		this.raggio = raggio ;
    }
	
    /*METODI*/
    //calcola il volume
    public double volume() {
        return 4/3 * Math.PI * Math.pow(raggio ,3);
    }
		//calcola la superficie
    public double superficie() {
        return 4 * Math.PI * raggio * raggio ;
    }
	
    //calcola il peso specifico utilizzando il peso specifico e il volume (ottenuto nel metodo volume)
   public String toString() {
        return "Sfera (" + raggio + ")";
    }
    
    
}
