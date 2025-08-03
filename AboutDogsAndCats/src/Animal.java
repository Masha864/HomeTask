
public class Animal {
    static int countAnimal = 0;

    Animal() {
        countAnimal++;
    }


    void run(int range) {
        System.out.println("Животное приплыло " + range + " м");
    }

    void swim(int range) {
        System.out.println("Животное приплыло " + range + " м");
    }

    public static int getCountAnimal() {
        return countAnimal;
    }
}







