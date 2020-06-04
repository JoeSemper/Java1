package hw7;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood (int appetite) {
        food -= appetite;
    }

    public void info() {
        System.out.println("Food: " + food);
    }

    public int getFood(){
        return food;
    }

    public void addFood(int amount) {
        food += amount;
    }


}