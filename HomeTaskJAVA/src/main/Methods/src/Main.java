//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {



    public static void main (String [] args, int date, String producer, double price, String country, String booking){
        Product name = new Product ("Name");
        Product date = new Product ("Date");
        Product producer = new Product ("Producer");
        Product price = new Product ("Price");
        Product country = new Product("Country");
        Product booking = new Product ("Booking");
    }

    public static void printProductInfo(Product product){
        System.out.println(product.getName());
        System.out.println(product.getDate());
        System.out.println(product.getProducer());
        System.out.println(product.getPrice());
        System.out.println(product.getCountry());
        System.out.println(product.getBooking());

    System.out.println("Продукт: " + product.getName + product.getDate + product.getProducer + product.getPrice + product.getCountry + product.getBooking);

    }
}