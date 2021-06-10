

public class Test {

	//Felder (fields) | Attribute, Eigenschaften
	// private --> Kapselung / encapsulation/ data hiding
	
	private String name;
	private int age;
	
	// Sichtbarkeit | access (access modifiers)
	// public --> alle duerfen sehen/schreiben (+)
	// private --> NUR die eigene Klasse / Objekt (-)
	// protected --> NUR die eigene Klasse / Objekt + Subklassen (#)
	
	public Test(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}//EoF