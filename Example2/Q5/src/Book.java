public class Book {

    String name;
    double price;

    public Book(String name,double  price) {
        this.name = name;
        this.price=price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double totalPrice(){
        return price+0.08*price;
    }
}
