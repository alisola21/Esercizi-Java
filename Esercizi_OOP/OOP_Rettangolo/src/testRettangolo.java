
public class testRettangolo {

	public static void main(String[] args) {
		
		//creo i rettangoli
		rettangolo r1 = new rettangolo(12, 3);
		rettangolo r2 = new rettangolo(20, 14);
		rettangolo r3 = new rettangolo(5, 10);
		
		
		//calcolo la somma delle aree
		double sommaAree = r1.area() + r2.area() +r3.area();
		
		
		//calcolo la somma dei perimetri
		double sommaPerimetri = r1.perimetro() + r2.perimetro() + r3.perimetro();
		
		
		System.out.println("PRIMO RETTANGOLO ");
		System.out.println("Area = " +r1.area());
		System.out.println("Perimetro = " +r1.perimetro());
		
		System.out.println();
		System.out.println("SECONDO RETTANGOLO ");
		System.out.println("Area = " +r2.area());
		System.out.println("Perimetro = " +r2.perimetro());
		
		System.out.println();
		System.out.println("TERZO RETTANGOLO ");
		System.out.println("Area = " +r3.area());
		System.out.print("Perimetro = " +r3.perimetro());
		
		System.out.println();
		System.out.println("La somma delle aree dei rettangoli è " +sommaAree);
		System.out.println("La somma delle aree dei rettangoli è " +sommaPerimetri);

	}

}
