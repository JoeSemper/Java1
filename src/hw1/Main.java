package hw1;

public class Main {
    public static void main(String[] args) {
        // 2 задание
        byte val1 = -10;
        short val2 = 10;
        int val3 = 100;
        long val4 = 1234567L;
        float val5 = 123.456f;
        double val6 = - 456.789;
        char val7 = 'a';
        boolean val8 = true;

        System.out.println(calc(2,4,6,2)); // проверка 3 задания
        System.out.println(check10and20(10, 5)); // проверка 4 задания
        isPositiveOrNegative(20); // проверка 5 задания
        System.out.println(isNegative(-10)); // проверка 6 задания
        printHello("Вася"); // проверка 7 задания
        checkYear (2020); // проверка 8 задания

    }
    // 3 задание
    public static int calc (int a, int b, int c, int d) {
        return(a*(b+(c/d)));

    }
    // 4 задание
    public static boolean check10and20 (int x, int y) {
        boolean result = false;
        if (x+y>=10 && x+y<=20) {
            result = true;
        }
        return result;
    }
    // 5 задание
    public static void isPositiveOrNegative (int a) {
        if (a<0) {
            System.out.println("Отрицательное");
        }
        else {
            System.out.println("Положительное");
        }
    }
    // 6 задание
    public static boolean isNegative(int a) {
        if (a<0) {
            return true;
        }
        return false;
    }
    // 7 задание
    public static void printHello (String name) {
        System.out.println ("Привет, " + name + "!");
    }
    // 8 задание
    public static void checkYear (int a) {
        if ((a%4 == 0) && ((a%400 == 0) || (a%100 != 0)))  {
            System.out.println(a + " високосный год");
        }
        else {
            System.out.println(a + " не високосный год");
        }
    }
}
