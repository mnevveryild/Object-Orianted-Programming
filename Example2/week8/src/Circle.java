public class Circle {
    private double radius = 1.0;
    private String color ="red";
    Circle(){}
    Circle(double height, double radius){
        this.radius=radius;
    }
    Circle(double height, double radius, String color){
        this.radius=radius;
        this.color=color;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public void setColor(String color){
        this.color=color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public double getArea(){
        return 3*getRadius()*getRadius();

    }

}
