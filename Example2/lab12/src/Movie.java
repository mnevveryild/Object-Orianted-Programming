

public class Movie{

    String name;
    double rating;
    int year;

    public Movie(String name , double vote ,int year) {
        this.name = name;
        this.rating = vote;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public void setVote(double vote) {
        this.rating = vote;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", vote=" + rating +
                ", year=" + year +
                '}';
    }





}
