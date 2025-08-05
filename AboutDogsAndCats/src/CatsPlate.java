public class CatsPlate {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Барсик", 35),
                new Cat("Васька", 20),
                new Cat("Мурзик", 15),
                new Cat("Пушок", 40),
        };

        System.out.println("Насыпать им корм.");
        Plate plate = new Plate(80);

        for (Cat cat : cats) {
            plate.info();
            cat.eat(plate);
            cat.info();
        }
        plate.addFood(50);
        plate.info();
        System.out.println();
    }
}
