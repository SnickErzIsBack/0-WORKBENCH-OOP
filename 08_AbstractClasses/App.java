public class App {
        public static void main(String[] args) {
       
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(10,10);
        Triangle triangle = new Triangle(10,10);

        ausgabe("-----------Areas-----------");
        ausgabe("Fläche Kreis: " + circle.area());
        ausgabe("Fläche Rechteck: " + rectangle.area());
        ausgabe("Fläche Dreeick: " + triangle.area());
        ausgabe("--------Differenzen--------");
        ausgabe("Differenz Fläche(Rechteck - Dreieck): " + areaDiff(rectangle,triangle));
        ausgabe("Differenz Fläche(Rechteck - Kreis): " + areaDiff(rectangle,circle));
        }

        //Problem: Aufwand/Nutzen: LINEAR!!!

        //Rechteck minus Dreieck
        public static double areaDiff(Rectangle r, Triangle t){
            return r.area() - t.area();
        }

        //Rechteck minus Kreis
        public static double areaDiff(Rectangle r, Circle c){
            return r.area() - c.area();
        }

        public static void ausgabe(String outputStr) {
            System.out.println(outputStr);
    }
} //EoF