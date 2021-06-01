public class App {
    
    
    public static void main(String[] args) {
    
        // ausgabe(String.valueOf(Math.PI));

        Cat cat1 = new Cat("Grizabella","white",29);
        ausgabe(cat1.tellYourAttributes("#name"));
        System.out.println("blick von außen: " + cat1);
        ausgabe(cat1.tellYourAttributes("#color"));
        ausgabe(cat1.tellYourAttributes("#age"));
               
        System.out.println("-----------------------------");

        Cat cat2 = new Cat("Alonzo","black",35);
        ausgabe(cat2.tellYourAttributes("#name"));
        System.out.println("blick von außen: " + cat2);
        ausgabe(cat2.tellYourAttributes("#color"));
        ausgabe(cat2.tellYourAttributes("#age"));
        
    }

    public static void ausgabe(String OutputStr) {
        System.out.println(OutputStr);
    }
}