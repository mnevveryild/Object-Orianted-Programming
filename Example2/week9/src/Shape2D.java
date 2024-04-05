public abstract class Shape2D {

    private final double P1=3;

    private double height;
    private double radius;
    private double width;

    Shape2D(double height,double width){
        this.height=height;
        this.width=width;
    }

    public Shape2D(double radius) {
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public abstract double getArea();

    public String toString() {
    return "asdasasdas" ;
    }
}
