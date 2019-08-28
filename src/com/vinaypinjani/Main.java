package com.vinaypinjani;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] mainArray = readIntegers(2);
        int minimumValue = findMin(mainArray);
        System.out.println("Entered Array is: " + Arrays.toString(mainArray));
        System.out.println("Minimum entered value is: " + minimumValue);
    }

    public static int[] readIntegers(int count) {
        System.out.println("Please enter " + count + " numbers:");
        int[] myArray = new int[count];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = scanner.nextInt();
        }
        return myArray;
    }
    public static int findMin(int[] array) {
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }
}
