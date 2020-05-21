package hw3;

import java.util.Scanner;
import java.util.Random;

public class Main {

    static String theWord;
    static Random random;

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        theWord = randomWord(); // загадываем слово

        System.out.println("Загадано слово, попробуйте отгадать.");


        // основной цикл игры
        while (true) {

            System.out.println("Введите слово:");
            String userWord = sc.nextLine();

            if (userWord.equals(theWord)) {
                System.out.println("Поздравляем, вы отгадали!");
                break;
            }

            System.out.println("Неверно. Попробуйте еще раз. Подсказка:");
            System.out.println(compareWorsds(theWord, userWord));
            System.out.println();
        }
    }


    // загадывает слово
    public static String randomWord(){

        random = new Random();

        String[] words = {"apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon",
                "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};

        int n = random.nextInt(words.length);

        return words[n];
    }


    // делает массив из решеток
    public static char[] makeSharp(int n) {
        char[] arr = new char[n];
        for (int i = 0; i < 15; i++) {
            arr[i] = '#';
        }
        return arr;

    }


    // сравнивает слова и возвращает подсказку
    public static char[] compareWorsds(String correctWord, String userWord) {

        char[] arr = makeSharp(15);

        // определяем до какой буквы сравнивать
        int n = correctWord.length();
        if (userWord.length() < n) {
            n = userWord.length();
        }

        for (int i = 0; i < n; i++){
            if (userWord.charAt(i) == correctWord.charAt(i)) {
                arr[i] = userWord.charAt(i);
            }
        }

        return arr;
    }

}



