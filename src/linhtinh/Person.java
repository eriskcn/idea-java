package linhtinh;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = Math.max(age, 0);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = Math.max(age, 0);
    }

    public static void main(String[] args) {
        Person john = new Person("John Doe", 35);
        System.out.println("Name: " + john.getName());
        System.out.println("Age: " + john.getAge());
    }
}
