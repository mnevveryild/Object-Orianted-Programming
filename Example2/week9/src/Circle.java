public class Circle extends Shape2D{

    public Circle(double radius) {
        super(radius);
    }

    public double getArea(){
        return 3*getRadius()*getRadius();
    }



}
