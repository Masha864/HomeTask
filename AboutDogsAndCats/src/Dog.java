public class Dog extends Animal {
    String name;
    static int countDod = 0;


    Dog(String name) {
        super();
        countDod++;
        this.name = name;
    }


    @Override
    void run(int range) {
        if (range > 500) {
            System.out.println(name + " больше не может бежать");
        } else {
            System.out.println(name + " пробежал " + range + " м");
        }

    }

    @Override
    void swim(int range) {
        if (range > 10) {
            System.out.println("Собака больше плыть не может " + range + " м");
        } else {
            System.out.println(name + " проплыл " + range + " м");
        }
    }

    static int getCountDod() {
        return countDod;
    }
}
