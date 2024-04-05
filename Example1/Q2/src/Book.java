public class Book implements Comparable<Book> {

    public String name;
    public double price;

    Book(String name,double price){
        this.name=name;
        this.price=price;

    }

    public double totalPrice(){
        return price + price* 0.08;
    }

    public String toString(){
        return name+"  "+totalPrice();
    }

    public int compareTo(Book b){
        return (int)(this.totalPrice()-b.totalPrice());
    }


}
