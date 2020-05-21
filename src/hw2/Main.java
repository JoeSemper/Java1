package hw2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // поверка 1 задания
//        int[] arr1 = {1, 0, 0, 1, 0, 1, 1, 0, 1};
//        System.out.println (Arrays.toString(inverseArr(arr1)));


        // поверка 2 задания
//         System.out.println (Arrays.toString(sequenceArr())); // поверка 2 задания

        // поверка 3 задания
//          int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//          System.out.println(Arrays.toString(multArr(arr3)));

        // поверка 4 задания
//        printSqrArr(squareArr());

        // поверка 5 задания
//        int[] arr5 = {2, 4, 9, 3, 7 , 13, 23, 5, 8, 1, 16};
//        System.out.printf ("min = %d, max = %d\n", findMin(arr5), findMax(arr5));

        // проверка 6 задания
//        int[] arr6 = {2, 1, 2, 2, 3};
//        System.out.println(checkBalanse(arr6));

        // проверка 7 задания
//        int n = -2;
//        int[] arr7 = {1, 2, 3, 4, 5, 6};
//        System.out.println(Arrays.toString(spinArr(arr7, n)));
    }

    // 1 задание
    public static int[] inverseArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        return arr;
    }

    // 2 задание
    public static int[] sequenceArr() {
        int[] arr = new int[8];
        int a = 0;
        for (int i = 0; i < 8; i++) {
            arr[i] = a;
            a += 3;
        }
        return arr;
    }

    // 3 задание
    public static int[] multArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        return arr;
    }

    // 4 задание
    public static int[][] squareArr() {
        int[][] arr = new int[8][8];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j || i == (arr.length - j - 1)) {
                    arr[i][j] = 1;
                }
            }
        }
        return arr;
    }

    public static void printSqrArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    // 5 задание
    public static int findMin(int[] arr) {
        int minA = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minA) {
                minA = arr[i];
            }
        }
        return minA;
    }

    public static int findMax(int[] arr) {
        int maxA = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxA) {
                maxA = arr[i];
            }
        }
        return maxA;
    }


    // 6 задание
    public static boolean checkBalanse(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int left = 0;
            int right = 0;
            for (int x = 0; x <= i; x++) {
                left += arr[x];
            }
            for (int y = i + 1; y < arr.length; y++) {
                right += arr[y];
            }
            if (left == right) {
                return true;
            }
        }
        return false;
    }

    // 7 задание
    public static int[] spinArr(int[] arr, int n) {
        if (n>=0) {
            for (int i = 0; i < n; i++) {
                int m = arr[0];
                for (int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = m;
            }
        } else {
            for (int i = 0; i > n; i--) {
                int m = arr[arr.length-1];
                for (int j = arr.length-1; j > 0; j--) {
                    arr[j] = arr[j-1];
                }
                arr[0] = m;
            }
        }
        return arr;
    }
}





