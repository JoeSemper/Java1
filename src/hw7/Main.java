package hw7;

public class Main
{
    public static void main(String[] args) {

        Plate plate = new Plate(40);

        Cat[] catArr = makeCatArr(4);

        for (Cat cat: catArr) {
            cat.eat(plate);
            cat.info();
            plate.info();
            System.out.println();
        }


        plate.addFood(50);

        for (Cat cat: catArr) {
            cat.eat(plate);
            cat.info();
            plate.info();
            System.out.println();
        }

    }

    // создает массив котов
    public static Cat[] makeCatArr(int n) {
        String[] namePool = {"Barsik", "Murzik", "Tigr", "Pantera", "Lev",
                "Ryzik", "Misyak"};

        Cat[] catArr = new Cat[n];
        for (int i= 0; i<catArr.length; i++){
            catArr[i] = new Cat(namePool[i]);
        }

        return catArr;
    }

}
