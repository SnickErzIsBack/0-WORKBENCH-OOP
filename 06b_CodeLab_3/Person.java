abstract class Person {
    
    protected String name;
	protected String firstName;
	protected int birthYear;
	
    protected Person(String name, String firstName, int birthYear) {
		this.name = name;
		this.firstName = firstName;
		this.birthYear = birthYear;
    }

    // * Getter
    public String getName() {
		return name;
	}
	
	//  * Setter
    public void setName(String name) {
		this.name = name;
	}
	
	//  * Getter
	public String getFirstName() {
		return firstName;
	}
	
	// * Setter
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	// * Getter
	public int getBirthYear() {
		return birthYear;
	}
	
	// * Setter
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

    // public void tellAboutYou(String) {}
    
}//EoF