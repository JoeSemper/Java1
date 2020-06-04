package hw6.animals;

import java.util.Random;

public class Dog extends Animal {

    private static int count = 0;
    Random rand = new Random();

    public Dog(String name) {
        super(name);
        maxRun = rand.nextInt(200)+400;
        maxSwim = rand.nextInt(10)+5;
        count++;
    }

    public static int getCount(){
        return count;
    }
}
