public class Cone extends Shape3D{

    public int a;
    public Cone(double radius, double height,double depth,int a) {
        super(radius,height,depth);
        this.a=a;
    }

    public int getA() {
        return a;
    }

    @Override
    public double getVolume() {
        return 0.33*3*getRadius()*getRadius()*getHeight();
    }

    @Override
    public double getArea() {
        return (3*getRadius()*getA())+(3*getRadius()*getRadius());
    }
}
