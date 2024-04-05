import java.util.Comparator;

public class yearCompare implements Comparator<Movie> {

    @Override
    public int compare(Movie m1, Movie m2) {
        return Integer.compare(m1.getYear(),m2.getYear());
    }
}
