public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super(Math.PI * radius * radius, 2 * Math.PI * radius);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        updateProperties();
    }

    public double getRadius() {
        return radius;
    }

    private void updateProperties() {
        double newArea = Math.PI * radius * radius;
        double newPerimeter = 2 * Math.PI * radius;
        setArea(newArea);
        setPerimeter(newPerimeter);
    }
}
