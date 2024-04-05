public class Square extends Shape2D{

    public Square(double width) {
        super(width);
    }

    @Override
    public double getArea() {
        return getWidth()*getWidth();
    }
}
