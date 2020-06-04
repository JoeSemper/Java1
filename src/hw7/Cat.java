package hw7;

import java.util.Random;

public class Cat {

    private String name;
    private int apetite;
    private boolean fedUp;

    Random random = new Random();

    public Cat(String name) {
        this.name = name;
        this.apetite = random.nextInt(6)+10;
        this.fedUp = false;
    }

    public void eat (Plate p) {

        if (p.getFood() < apetite){
            System.out.println("Не достаточно еды");
            return;
        }

        p.decreaseFood(apetite);

        System.out.println(name + " поел");

        fedUp = true;
    }


    public String getName(){
        return name;
    }


    public void info(){
        System.out.println(name + " сыт - " + fedUp);
    }
}
