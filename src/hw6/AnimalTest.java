package hw6;
import hw6.animals.*;

public class AnimalTest {

    public static void main(String[] args) {

        Dog dog = new Dog("Бобик");
        dog.run(100);
        dog.swim(5);

        Cat cat = new Cat("Барсик");
        cat.run(50);
        cat.swim(3);


        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Рыжик");
        Dog dog1 = new Dog("Тузик");

        countAnimals();

    }

    // считает животных
    public static void countAnimals(){
        System.out.println();
        System.out.printf("Всего животных сосздано %d \n", Animal.getCount());
        System.out.printf("Всего собак сосздано %d \n", Dog.getCount());
        System.out.printf("Всего котов сосздано %d \n", Cat.getCount());
    }
}

