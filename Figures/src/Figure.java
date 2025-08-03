public abstract class Figure {
    protected double area;
    protected double perimeter;

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    protected abstract void recalculateProperties();
}





