import java.util.LinkedList;
import java.util.ListIterator;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        LinkedList<Book> books = new LinkedList<Book>();
        books.add(new Book("Momo",90.0));
        books.add(new Book("Kuyucaklı Yusuf",80.75));
        books.add(new Book("Kürk Mantolu Madonna",78.25));
        books.add(new Book("Küçük Prens",56.50));

        books.sort(new calculatePrice());

        ListIterator<Book> iterator = books.listIterator();
        while (iterator.hasNext()){
            Book book = iterator.next();
            System.out.println("name:  "+book.name+
                    "   price : "+ book.totalPrice());
        }


    }
}