package linhtinh;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return this.numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void printDetails() {
        super.printDetails();
        System.out.println("Number of Doors: " + this.numberOfDoors);
    }

    public static void main(String[] args) {
        Car civic = new Car("Honda", "Civic Type R", 2024, 4);
        civic.printDetails();
    }
}
