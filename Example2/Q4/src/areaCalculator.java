import java.util.Comparator;

public class areaCalculator implements Comparator<Circle> {

    public int compare(Circle c1,Circle c2){
        double area1= c1.calculateArea();
        double area2= c2.calculateArea();
        return Double.compare(area1,area2);
    }





}
