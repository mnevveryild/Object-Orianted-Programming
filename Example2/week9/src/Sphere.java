public class Sphere extends Shape3D{

    public Sphere(double radius, double depth) {
        super(radius, depth, depth);
    }

    @Override
    public double getVolume() {
        return 1.33*3*getRadius()*getRadius()*getRadius();
    }

    @Override
    public double getArea() {
        return 4*3*getRadius()*getRadius();
    }
}
