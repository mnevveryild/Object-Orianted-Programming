public class Pyramit extends Shape3D {

    public Pyramit(double height, double width, double depth) {
            super(height,width,depth);
    }

    @Override
    public double getVolume() {
        return 0.33*getHeight()*getWidth()*getDepth();
    }

    @Override
    public double getArea() {
        return 0;
    }
}
