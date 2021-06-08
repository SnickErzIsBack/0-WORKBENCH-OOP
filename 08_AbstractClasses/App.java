public class App {
        public static void main(String[] args) {
       
        Circle circle = new Circle(10.0);
        Rectangle rectangle = new Rectangle(10,10);
        Triangle triangle = new Triangle(10,10);

        ausgabe("-----------Areas-----------");
        ausgabe("Fläche Kreis: " + circle.area());
        ausgabe("Fläche Rechteck: " + rectangle.area());
        ausgabe("Fläche Dreeick: " + triangle.area());

        }
        public static void ausgabe(String outputStr) {
            System.out.println(outputStr);
    }
} //EoF