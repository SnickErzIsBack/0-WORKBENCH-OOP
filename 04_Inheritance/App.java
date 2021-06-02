public class App {
    
    public static void main(String[] args) {
           
        Cat cat1 = new Cat("Grizabella", "white", 29);
        ausgabe(cat1.tellYourAttributes("#name"));
        ausgabe(cat1.tellYourAttributes("#color"));

        ausgabe(cat1.tellYourAge("#age"));
        ausgabe(cat1.tellYourAge("#age"));
        ausgabe(cat1.tellYourAge("#age"));
        ausgabe(cat1.tellYourAge("#age"));

        System.out.println("-----------------");
        
        Tomcat tomcat1 = new Tomcat("Alonzo", "black", 35); //Änderung des Reference Type
        ausgabe(tomcat1.tellYourAttributes("#name"));
        ausgabe(tomcat1.tellYourAttributes("#color"));
        ausgabe(tomcat1.tellYourAttributes("#age"));

    }

    public static void ausgabe(String outputStr) {
      System.out.println(outputStr);  
    }


}
