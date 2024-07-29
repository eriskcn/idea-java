package linhtinh;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = Math.max(width, 0);
        this.height = Math.max(height, 0);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = Math.max(width, 0);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = Math.max(height, 0);
    }

    public double getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 5);
        System.out.println("Area: " + rectangle.getArea());
    }
}
