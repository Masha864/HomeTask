public class Cat extends Animal {
    String name;
    static int countCat = 0;

    Cat(String name) {
        super();
        countCat++;
        this.name = name;
    }

    @Override
    void run(int range) {
        if (range > 200) {
            System.out.println(name + " больше бежать не может");
        } else {
            System.out.println(name + " пробежал " + range + " м");
        }
    }

    @Override
    void swim(int range) {
        System.out.println("Коты не плавают");
    }

    static int getCountCat() {
        return countCat;
    }

}
