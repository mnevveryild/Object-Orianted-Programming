import java.util.LinkedList;
import java.util.ListIterator;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        LinkedList<Circle> circleList = new LinkedList<Circle>();
        circleList.add(new Circle("purple", 10.0));
        circleList.add(new Circle("blue", 0.5));
        circleList.add(new Circle("yellow", 3.75));

        circleList.sort(new areaCalculator());

        ListIterator<Circle> iterator = circleList.listIterator();
        while (iterator.hasNext()) {
            Circle circle = iterator.next();
            System.out.println("radius: " + circle.getRadius() + " color: " +
                    circle.getColor() + "  area:  " + circle.calculateArea());

        }
    }

    }
