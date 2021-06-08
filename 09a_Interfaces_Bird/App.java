public class App {
    public static void main(String[] args) {
       
        Bird bird = new Bird();

        ausgabe(bird.feathers());
        ausgabe(bird.fly());
        
    }

    private static void ausgabe(String outStr) {
        System.out.println(outStr);
    }
}//EoF