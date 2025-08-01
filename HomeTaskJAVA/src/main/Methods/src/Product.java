public class Product{
    private String name;
    private int date;
    private String producer;
    private double price;
    private String country;
    private String booking;


    public Product(String name, int date, String producer, double price, String country, String booking) {
        this.name = name;
        this.date = date;
        this.producer = producer;
        this.price = price;
        this.country = country;
        this.booking = booking;

    }

    public String getName() {
        return name;
    }

    public int getDate() {
        return date;
    }
    public String getProducer() {
        return producer;
    }
    public double getPrice() {
        return price;
    }
    public String getCountry() {
        return country;
    }
    public String getBooking() {
        return booking;
    }


    public void printInfo() {
        System.out.println("Название: " + name);
        System.out.println("Дата производства: " + date);
        System.out.println("Производитель: " +  producer);
        System.out.println("Цена: " +  price);
        System.out.println("Страна производитель: " + country);
        System.out.println("Бронь: " +  booking);
    }
}
