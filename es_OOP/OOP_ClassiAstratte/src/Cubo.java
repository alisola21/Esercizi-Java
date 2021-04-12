
public class Cubo extends Solido  {
	
	/*VARIABILI*/
	private double lato ;
    //private double pesoSpecifico ;
    
	/*COSTRUTTORE*/
	public Cubo(double lato, double ps) {
    	super(ps); //il peso specifico viene ereditato dalla super classe con il metodo super()
    	this.lato = lato ;
        
    }
    
    /*METODI*/
    public double volume() {
        return Math.pow(lato ,3);
    }
    public double superficie() {
        return 6* lato * lato;
    }
    
    public String toString() {
        return "Cubo ("+ lato +")";
    }
}
