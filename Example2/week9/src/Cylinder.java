public class Cylinder extends Shape3D{

    public Cylinder(double radius, double height,double depth) {
        super(radius, height, depth);
    }

    @Override
    public double getArea(){
        return 2*3*getRadius()*getHeight();
    }

    @Override
    public double getVolume() {
        return 3*getRadius()*getRadius()*getHeight();
    }
}
