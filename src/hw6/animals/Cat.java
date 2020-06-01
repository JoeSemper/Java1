package hw6.animals;

import java.util.Random;

public class Cat extends Animal {

    private static int count = 0;
    Random rand = new Random();

    public Cat(String name) {
        super(name);
        maxRun = rand.nextInt(100)+150;
        maxSwim = 0;
        count++;
    }

    @Override
    public void swim(int distanse){
        System.out.println("Кот не умеет плавать");
    }

    public static int getCount(){
        return count;
    }

}
