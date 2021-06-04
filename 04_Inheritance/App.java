public class App {
    
    public static void main(String[] args) {          
        
        Cat cat1 = new Cat("Grizabella", "white", 29);
        //#region
        ausgabe(cat1.tellYourAttributes("#name"));
        ausgabe(cat1.tellYourAttributes("#color"));

        ausgabe(cat1.tellYourAge("#age"));
        ausgabe(cat1.tellYourAge("#age"));
        ausgabe(cat1.tellYourAge("#age"));
        ausgabe(cat1.tellYourAge("#age"));
        
        System.out.println("-----------------");
        //#endregion
        
        Tomcat tomcat1 = new Tomcat("Alonzo", "black", 35);
        //#region
        ausgabe(tomcat1.tellYourAttributes("#name"));
        ausgabe(tomcat1.tellYourAttributes("#color"));
        ausgabe(tomcat1.tellYourAttributes("#age"));
        //#endregion
    }

    public static void ausgabe(String outputStr) {
      System.out.println(outputStr);  
    }
} //EoF