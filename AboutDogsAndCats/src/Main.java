//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();

        Cat barsik = new Cat("Barsik");
        Dog bobic = new Dog("Bobic");
        Cat barsik1 = new Cat("Barsik");
        Dog bobic1 = new Dog("Bobic");

        barsik.run(200);
        barsik.run(201);
        barsik.swim(0);


        bobic.run(500);
        bobic.run(501);

        System.out.println("Всего животных: " +Animal.getCountAnimal());
        System.out.println("Всего котов: "+Cat.getCountCat());
        System.out.println("Всего собак: "+Dog.getCountDod());







    }
}