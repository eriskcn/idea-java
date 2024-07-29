package linhtinh;

public class Book {
    private String title;
    private String author;
    private double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        if (price < 0) {
            this.price = 0;
        } else {
            this.price = price;
        }
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public double getPrice() {
        return this.price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Price cannot be smaller than 0");
        } else {
            this.price = price;
        }
    }

    public void displayInfo() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
    }

    public static void main(String[] args) {
        Book myBook = new Book("Truyen Kieu", "Nguyen Du", 69.9);
        myBook.displayInfo();
    }
}

