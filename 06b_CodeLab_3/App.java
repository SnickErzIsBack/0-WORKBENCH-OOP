public class App {
    public static void main(String[] args) {
		
		Accounting ma1 = new Accounting("Popow", "Oleg", 1974, "ID002" , "accounting", "accountant",2000);
		Advertising ma2 = new Advertising("Martinelli", "Silvia", 1985, "ID003" , "advertising", "consultant",2018);
		Production ma3 = new Production("Müller", "Max", 1965, "ID001" , "production", "worker",1985);
				
		ma1.doYourWork("#manufacturing");
		ma1.giveOutCoS();
		ma1.startsWork();
		ma1.hasLunch();
				
		ausgabe("-------------------------");

		ma2.doYourWork("#accounting");			
		ma2.giveOutCoS();			
		ma2.startsWork();
		ma2.hasLunch();
						
		ausgabe("-------------------------");

		ma3.doYourWork("#advertising");
		ma3.giveOutCoS();
		ma3.startsWork();
		ma3.hasLunch();
							
		// System.out.println(ma1.getBirthYear());				
		// ma2.setName("Nossow");
		// System.out.println(ma2.getName());
    }

	private static void ausgabe(String outStr) {
		System.out.println(outStr);
	}
} //EoF
