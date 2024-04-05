public abstract class Shape3D extends Shape2D{
    private double depth;


    Shape3D(double radius, double height, double depth) {
        super(radius,height);
        this.depth=depth;

    }


    public abstract double getVolume();

    @Override
    public String toString() {
        return "asdsddsa";
    }

    public double getDepth() {
        return depth;
    }
}
