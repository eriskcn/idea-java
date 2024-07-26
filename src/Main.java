//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println();
        // Create an instance of Circle
        Circle circle = new Circle(2.0);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        System.out.println();
        // Create another instance of Circle
        Circle circle2 = new Circle(3.0);
        System.out.println("Radius: " + circle2.getRadius());
        System.out.println("Area: " + circle2.getArea());
        System.out.println("Perimeter: " + circle2.getPerimeter());

        System.out.println();
        circle2.setRadius(4.0);
        System.out.println("Radius: " + circle2.getRadius());
        System.out.println("Area: " + circle2.getArea());
        System.out.println("Perimeter: " + circle2.getPerimeter());
    }
}