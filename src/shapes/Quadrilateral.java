package shapes;

abstract class Quadrilateral extends Shape implements Measureable {

    protected double length;
    protected double width;

    // constructor
    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // getters
    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    //setters
    abstract void setLength(double length);

    abstract void setWidth(double width);
}
