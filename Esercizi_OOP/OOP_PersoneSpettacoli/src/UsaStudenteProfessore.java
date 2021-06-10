public class UsaStudenteProfessore {

	public static void main(String[] args) {
		
		Persona x = new Persona("Gino ","Via Milano 10");
		x. visualizza();
			
		Studente s1 = new Studente("Carlo Bianchi ","Via Garibaldi 71");
		s1. visualizza();
			
		Studente s2 = new Studente("Mario Rossi ","Via Mazzini 11");
		s2. visualizza();
			
		Professore p1 = new Professore("Mario Rossi ",
		"Via Marconi 10", "a1123 ",
		"Dipartimento di Informatica ");
		p1. visualizza();
			
		Professore p2 = new Professore("Luigi Verdi ",
		"Via Verdi 70","a9521 ",
		"Dipartimento di Biologia ");
		p2. visualizza();
			
	}
}

