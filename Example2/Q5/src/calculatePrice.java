import java.util.Comparator;
public class calculatePrice implements Comparator<Book>{

    @Override
    public int compare(Book b1, Book b2) {
        double price1=b1.totalPrice();
        double price2=b2.totalPrice();
        return Double.compare(price1,price2);
    }
}
