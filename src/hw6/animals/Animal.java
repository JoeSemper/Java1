package hw6.animals;

public abstract class Animal {

    String name;
    int maxRun;
    int maxSwim;

    private static int count = 0;

    public Animal(String name){
        this.name = name;
        count++;
    }

    public void run(int distanse){
        if (distanse <= maxRun){
            System.out.printf("%s пробежал %d метров \n", name, distanse);
        } else {
            System.out.printf("%s не может пробежать больше %d метров \n", name, maxRun);
        }

    }

    public void swim(int distanse){
        if (distanse <= maxSwim){
            System.out.printf("%s проплыл %d метров \n", name, distanse);
        } else {
            System.out.printf("%s не может проплыть %d больше \n", name, maxSwim);
        }
    }

    public static int getCount(){
        return count;
    }
}
