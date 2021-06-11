

public class App {

	public static void main(String[] args) {
		
		// Namenslisten --> Arrays
		String [] catNames = {"Grizabella","Alonzo","RumTumTugger","Suzanne"};
		String [] dogNames = {"Fifi","Boo","Cassie","Bonzo"};

		// Init cats ...
		for (int i = 0; i < catNames.length; i++) {
			Controller.addNewCat(catNames[i]);
		}
		
		// Init dogs ...
		for (int i = 0; i < dogNames.length; i++) {
			Controller.addNewDog(dogNames[i]);
		}

		// Ausgaben ...
		
		ausgabe("--------- Hunde fragen Katzen :-( ----------");
		
		ausgabe(Controller.getSomeRandomDog().askACat());
		ausgabe(Controller.getSomeRandomDog().askACat());
		ausgabe(Controller.getSomeRandomDog().askACat());
		
		ausgabe("--------- Katzen fragen Katzen :-) ----------");
		
		ausgabe(Controller.getSomeRandomCat().askACat());
		ausgabe(Controller.getSomeRandomCat().askACat());
		ausgabe(Controller.getSomeRandomCat().askACat());
		
		
		ausgabe("--------- PetSounds ----------");
		
		ausgabe(Controller.getSomeRandomDog().petSounds());
		ausgabe(Controller.getSomeRandomCat().petSounds());

	}
	
	public static void ausgabe(String outStr) {
		System.out.println(outStr);
	}

}
