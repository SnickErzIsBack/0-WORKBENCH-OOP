public class App {
        public static void main(String[] args) {

            Circle circle = new Circle(5.0);
            Rectangle rectangle = new Rectangle(10,10);
            Triangle triangle = new Triangle(10,10);

            ausgabe("-----------Areas-----------");
            ausgabe("Fläche Kreis: " + circle.area());
            ausgabe("Fläche Rechteck: " + rectangle.area());
            ausgabe("Fläche Dreieck: " + triangle.area());
            ausgabe("");
            ausgabe("--------Differenzen--------");
            ausgabe("Fläche(Rechteck - Dreieck): " + areaDiff(rectangle,triangle));
            ausgabe("Fläche(Rechteck - Kreis): " + areaDiff(rectangle,circle));
            ausgabe("Fläche(Kreis - Dreieck): " + areaDiff(circle,triangle));
        }

        //Shape - Shape ...One Size fits all...
        public static double areaDiff(Shape s1, Shape s2) {
            return s1.area() - s2.area();
        }

        public static void ausgabe(String outputStr) {
            System.out.println(outputStr);
    }
} //EoF