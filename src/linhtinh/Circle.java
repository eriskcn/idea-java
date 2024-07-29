package linhtinh;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = Math.max(radius, 0);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = Math.max(radius, 0);
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Area: " + circle.getArea());
    }
}
