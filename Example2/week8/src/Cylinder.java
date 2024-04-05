public class Cylinder extends Circle{

    private double height = 1.0;

    Cylinder(){}
    Cylinder( double height){
        this.height=height;
    }
    Cylinder(double height,double radius){
        super(height,radius);
        this.height=height;

    }
    Cylinder(double height,double radius,String color){
        super(height,radius,color);
        this.height=height;
    }
    public double getHeight(){
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}';
    }

    public double getVolume(){

        return 2*3*getRadius()*(getRadius()+getHeight());
    }
}
