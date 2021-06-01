public class App {
    
    public static void main(String[] args) {
        
        Cat cat1 = new Cat("Grizabella","white",29);
        cat1.tellYourAttributes("#name");
        cat1.tellYourAttributes("#color");
        cat1.tellYourAttributes("#age");
        cat1.tellYourAttributes("sdfsdf");
        
 
    System.out.println("blick von außen: " + cat1);
                
    System.out.println("-----------------------------");

    // Cat cat2 = new Cat("Alonzo","black",35);
    // System.out.println("blick von außen: " + cat2);
    // cat1.tellYourAttributes("#name");
    // cat2.tellYourAttributes("#color");
    // cat2.tellYourAttributes("#age");
    // cat2.tellYourAttributes("sdfsdf");
    }
}