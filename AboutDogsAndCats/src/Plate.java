public class Plate {
    private int food;

    Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int x) {
        int delta = food - x;
        if (delta < 0) {
            return false;
        }
        food -= x;
        return true;
    }

    public void info() {
        System.out.printf("\nТарелка наполнена на %d%%.", food);
    }

    public void addFood(int add) {
        System.out.printf("\nДобавить корма >>> %d%%.", add);
        food += add;
    }
}
