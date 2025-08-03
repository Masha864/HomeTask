public final class Triangle extends Figure{
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        recalculateProperties();
    }

    @Override
    protected void recalculateProperties() {
        perimeter = a + b + c;

        final double p = perimeter / 2.0;
        area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
        recalculateProperties();
    }
}