public class RectangleShape extends Shape {
    private double length;
    private double width;

    public RectangleShape() {
        length = 0;
        width = 0;
        toString();
    }

    public RectangleShape(double l, double w) {
        length = l;
        width = w;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }

    public String toString() {
        return ("Length = " + length + ", Width = " + width + ", Permeter = " + perimeter() + ", Area = " + area());
    }

}
