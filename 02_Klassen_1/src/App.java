public class App {
    
    public static void main(String[] args) {
        
        Cat cat1 = new Cat("Grizabella","white",29);

    System.out.println("blick von außen: " + cat1);
    
    cat1.tellUrName();
    cat1.tellUrFurColor();
    cat1.tellUrAge();
        
    System.out.println("-----------------------------");

    Cat cat2 = new Cat("Alonzo","black",35);

    System.out.println("blick von außen: " + cat2);
    
    cat2.tellUrName();
    cat2.tellUrFurColor();
    cat2.tellUrAge();
    
    }
}