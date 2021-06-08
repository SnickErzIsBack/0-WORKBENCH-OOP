public class Rectangle extends Shape{

    private double aSide, bSide;

    public Rectangle(double aSide, double bSide) {
        this.aSide = aSide;
        this.bSide = bSide;
    }

    @Override
    public double area() {
        //return Math.PI * radius * radius;
        return aSide*bSide;
    }
} //EoF