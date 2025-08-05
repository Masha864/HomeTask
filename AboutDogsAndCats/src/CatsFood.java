public class CatsFood {
    private String name;
    private int appetite;
    private boolean satiety;

    CatsFood(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }

    private String getName() {
        return name;
    }

    private int getAppetite() {
        return appetite;
    }

    private boolean isSatiety() {
        return satiety;
    }

    void info() {
        System.out.printf("\nКот %s хочет есть %d%% и орёт)).\n", getName(), getAppetite());
        System.out.printf("Кот %s %s", getName(), isSatiety() ?
                "поел.\n" : "Мало еды. Мяу!\n");
    }

    void eat(Plate p) {
        if (!isSatiety() && p.decreaseFood(getAppetite())) {
            satiety = true;
        }
    }
}
