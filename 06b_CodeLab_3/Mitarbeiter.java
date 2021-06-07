import java.util.Calendar;

abstract class Mitarbeiter extends Person {
		
	public String workID;
	public String department;
	public String role;
	public int hiredYear;
	private int currentYear = Calendar.getInstance().get(Calendar.YEAR);
				
	protected Mitarbeiter(String name, String firstName, int birthYear, String workID, String department, String role, int hiredYear){
		super(name,firstName,birthYear);
		this.workID = workID;
		this.department = department;
		this.role = role;
		this.hiredYear = hiredYear;
	}

	// @param flag 
	public void doYourWork(String flag) {
		
		switch (flag) {
			case "#manufacturing":
				this.assembleCar();
				break;
			case "#accounting":
				this.checkAccount();
				break;			
			case "#advertising":
				this.postingOnSocialMedia();
				break;
			default:
				this.doSomething();
				break;
		}
	}
		
	// Ausgabe2 // Betriebszugehörigkeit
	protected void giveOutCoS() {
		System.out.println("I'm working here for " + (currentYear-hiredYear) + " Years.");		
	}

	// Ausgabe3 //  Verhalten Arbeitsbeginn
	protected void startsWork() {
		System.out.println("Now, I'm starting my work.");		
	}
	
	// Ausgabe4 // Verhalten Lunch
	protected void hasLunch() {
		System.out.println("Finally, I'm having lunch!");		
	}
	
	// Ausgabe --> accounting
	private void checkAccount() {
		System.out.println("Hi, I'm " + firstName + " " + name + " and I'm checking a customer's account!");		
	}
	
	// Ausgabe --> production
	private void assembleCar() {
		System.out.println("Hi, I'm " + firstName + " " + name + " and I'm assembling a car!");		
	}
	
	// Ausgabe --> advertising
	private void postingOnSocialMedia() {
		System.out.println("Hi, I'm " + firstName + " " + name + " and I'm posting a phothograph on IG!");		
	}
	
	// Ausgabe --> Default
	private void doSomething() {
		System.out.println("Hi, I'm doing something.");		
	}
} // EoF