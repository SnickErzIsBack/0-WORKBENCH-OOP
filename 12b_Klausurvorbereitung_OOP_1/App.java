

public class App {

	public static void main(String[] args) {
		
		// MAIN methode - ist der einstieg in die programmstruktur
		// >>> KLAUSUR relevant <<< 
		// test --> Referenzvariable / RAM-Adresse des Objekts/Instanz (object/instance)
		// Test --> Referenztyp (reference type)
		// Object <--> Instanz
		
		Test test = new Test();
		System.out.println("Referenzvariable: " + test);
		test.showAddress();
	}

}
