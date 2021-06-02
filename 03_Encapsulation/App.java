
public class App {

	public static void main(String[] args) {
		Test test = new Test();
		test.setTestStr("Hai2");
		ausgabe(test.getTestStr());
	}
		
	public static void ausgabe(String outStr){
		System.out.println(outStr);
	}
}
