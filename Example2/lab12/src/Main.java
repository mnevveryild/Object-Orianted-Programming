import java.util.*;
import java.util.ListIterator;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));


        System.out.println("Sorted by rating");

        list.sort(new ratingCompare());
        ListIterator<Movie> iterator = list.listIterator();
        while (iterator.hasNext()) {
            Movie movie = iterator.next();
            System.out.println("name  " + movie.name + "  rating:  " + movie.rating +
                    "  year:  " + movie.year);

        }
        System.out.println("Sorted by name");
        list.sort(new nameCompare());
        ListIterator<Movie> iterator1 = list.listIterator();
        while (iterator1.hasNext()) {
            Movie movie = iterator1.next();
            System.out.println("name  " + movie.name + "  rating:  " + movie.rating +
                    "  year:  " + movie.year);

        }

        System.out.println("Sorted by year");
        list.sort(new yearCompare());
        ListIterator<Movie> iterator2 = list.listIterator();
        while (iterator2.hasNext()) {
            Movie movie = iterator2.next();
            System.out.println("name  " + movie.name + "  rating:  " + movie.rating +
                    "  year:  " + movie.year);

        }


    }
}