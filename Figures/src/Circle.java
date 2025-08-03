public final class Circle extends Figure {
    private double r;

    public Circle(double r) {
        this.r = r;
        recalculateProperties();
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
        recalculateProperties();
    }

    @Override
    protected void recalculateProperties() {
        area = Math.PI * r * r;
        perimeter = 2.0 * Math.PI * r;
    }
}
