import java.util.Comparator;

public class Circle {

    final static double Pi=3.14;
    double radius;
    String color;


    Circle(double radius,String color){
        this.radius=radius;
        this.color=color;

    }

    double CalculateArea(){
        return radius*radius*Pi;
    }

    public String toString() {
        return "area ="+ CalculateArea();
    }
}

class areaComp implements Comparator<Circle>{

    public int compare(Circle c1,Circle c2){
        return (int)(c1.CalculateArea()-c2.CalculateArea());
    }

}
