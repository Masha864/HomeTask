public class Product {

    private String name;
    private int date;
    private String producer;
    private double price;
    private String country;
    private boolean booking;
}

public Product(String name, int date, String producer, double price, String country, boolean booking) {

    this.name = name;
    this.date = date;
    this.producer = producer;
    this.price = price;
    this.country = country;
    this.booking = booking;
}

public void printInfo() {

    System.out.println("Смартфон: " + productsArray[0]);
    System.out.println("Смартфон: " + productsArray[1]);
    System.out.println("Смартфон: " + productsArray[2]);
    System.out.println("Смартфон: " + productsArray[3]);
    System.out.println("Смартфон: " + productsArray[4]);
}

public int getDate() {
    return date;
}
