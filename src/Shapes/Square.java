package Shapes;

public class Square extends Quadrilateral{

    public Square(double side) {
        super(side, side);
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
