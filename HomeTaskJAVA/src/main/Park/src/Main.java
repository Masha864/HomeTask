
public class Main {
    public static void main(String[] args) {
        Park park = new Park("Wonderland", "Парк Горького");
        Attraction rollerCoaster = park.new Attraction("Американские горки", "10:00 AM - 8:00 PM", 5.0);
        Attraction ferrisWheel = park.new Attraction("Колесо обозрения", "9:00 AM - 10:00 PM", 3.0);
        Attraction carousel = park.new Attraction("Карусель", "12:00 PM - 12:00 AM", 4.0);

        rollerCoaster.printInfo();
        ferrisWheel.printInfo();
        carousel.printInfo();
    }

}

