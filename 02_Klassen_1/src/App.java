public class App {
    
    public static void main(String[] args) {
        
        Cat cat1 = new Cat();

    System.out.println("blick von außen: " + cat1);
    cat1.name = "Grizabella";
    cat1.tellUrAddress();
    cat1.tellUrName();


    System.out.println("-----------------------------");

        Cat cat2 = new Cat();

    System.out.println("blick von außen: " + cat2);
    cat2.name = "Alonzo";
    cat2.tellUrAddress();
    cat2.tellUrName();

    }
}