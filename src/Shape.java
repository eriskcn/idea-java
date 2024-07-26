public abstract class Shape implements IShape {
    private double area;
    private double perimeter;

    protected Shape(double area, double perimeter) {
        this.area = area;
        this.perimeter = perimeter;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public double getPerimeter() {
        return perimeter;
    }

    protected void setArea(double area) {
        this.area = area;
    }

    protected void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
}
