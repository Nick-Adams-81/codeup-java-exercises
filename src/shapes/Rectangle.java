package shapes;

public class Rectangle extends Quadrilateral {

    public Rectangle(double length, double width) {
        super(length, width);
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }

    protected void setLength(double side) {
        this.length = side;
    }

    protected void setWidth(double side) {
        this.width = side;
    }

}
