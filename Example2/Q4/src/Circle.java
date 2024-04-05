public class Circle {

    double Pi=2.14;
    double radius;
    String color;

    public Circle(String color,double radius) {
        this.color = color;
        this.radius=radius;
    }

    public double calculateArea() {
        return Pi*radius*radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
