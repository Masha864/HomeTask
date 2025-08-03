
public final class Rectangle extends Figure {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
        recalculateProperties();
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
        recalculateProperties();
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
        recalculateProperties();
    }

    @Override
    protected void recalculateProperties() {
        area = a * b;
        perimeter = 2.0 * (a + b);
    }
}
