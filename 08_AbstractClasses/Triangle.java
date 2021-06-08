public class Triangle extends Shape{

    private double baseLine, height;
    
    public Triangle(double baseLine, double height) {
        this.baseLine = baseLine;
        this.height = height;
    }

    @Override
    public double area() {
        return baseLine * height / 2;
    }
}//EoF
