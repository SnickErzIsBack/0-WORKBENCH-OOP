public class App {
    
    public static void main(String[] args) {
        
        Cat cat = new Cat();

    System.out.println("blick von außen: " + cat);
    cat.tellUrAddress();

    System.out.println("-----------------------------");

        Cat cat2 = new Cat();

    System.out.println("blick von außen: " + cat2);
    cat2.tellUrAddress();

    }
}