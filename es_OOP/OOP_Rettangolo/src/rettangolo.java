
public class rettangolo extends EccezioneBaseNegativa {

	//variabile base 
	public int base;
	
	//variabile altezza
	public int altezza;
	
	
	//COSTRUTTORE che crea il rettangolo
	public rettangolo(int b, int a){
		base = b;
		altezza = a;
	}
	
	//metodo ridimensiona
	/*public void ridimensiona(double base, double altezza) {
		base
	}*/
	
	//metodo perimetro
	public int perimetro() {
		return (base+altezza)*2;
	}
	
	//metodo area
	public int area() {
		return base*altezza;
	}
	
	public void setBase ( int x) throws EccezioneBaseNegativa {
		if (x <0) throw new EccezioneBaseNegativa()
		else base =x;
		}
}
