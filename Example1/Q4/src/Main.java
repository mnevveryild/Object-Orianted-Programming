import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.ListIterator;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Circle c1 = new Circle(2,"mavi");
        Circle c2 = new Circle(4,"mor");
        Circle c3= new Circle(3,"sarı");

        LinkedList<Circle> list = new LinkedList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);

        Comparator areaComp = new areaComp();
        Collections.sort(list,areaComp);

        ListIterator<Circle> iterator = list.listIterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}