package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task 1");
        String jewels = "aAb";
        String stones = "cacAcA";
        System.out.println("Precious jewels: " + numJewelsInStones(jewels, stones));
        int[] array = new int[10];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(20) - 10;
        }
        System.out.println("Task2");
        System.out.println("Array: ");
        System.out.println(Arrays.toString(array));
        sortArray(array);
        System.out.println("Sorted array: ");
        System.out.println(Arrays.toString(array));
        squareArray(array);
        System.out.println("Squared array: ");
        System.out.println(Arrays.toString(array));
        System.out.println("Task 3");
        String s = "wefDSFerf";
        System.out.println("String: "+s);
        System.out.println("Uppercase to low case: "+lCase(s));
    }

    private static String lCase(String inputLine) {
        StringBuilder inputLineT = new StringBuilder(inputLine);
        for (int i = 0; i < inputLineT.length(); i++) {
            if (inputLineT.charAt(i) >= 65 && inputLineT.charAt(i) <= 91)
            {
                inputLineT.setCharAt(i, (char) (inputLineT.charAt(i) + 32));
            }
        }
        return inputLineT.toString();
    }

    private static void squareArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i];
        }
        sortArray(array);
    }

    private static void sortArray(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tm = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tm;
                }

            }
        }
    }

    private static int numJewelsInStones(String jewels, String stones) {
        char[] charJewels = jewels.toCharArray();
        char[] charStones = stones.toCharArray();
        int count = 0;
        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                if (charJewels[i] == charStones[j]) {
                    count++;
                }
            }
        }
        return count;
    }

}
