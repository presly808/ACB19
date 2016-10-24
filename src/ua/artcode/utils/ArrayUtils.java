package ua.artcode.utils;

import java.util.Arrays;

/**
 * Created by serhii on 10/22/16.
 */
public class ArrayUtils {

    public static int[] createRandomArr(int size, int range){
        int[] mas = new int[size];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int)(Math.random() * range);
        }

        return mas;
    }

    public static void printArr(int[] mas) {
        if(mas == null || mas.length == 0){
            System.out.println("{}");
            return;
        }

        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + ", ");
        }
        System.out.println();
    }

    // return array's index of minimum element
    public static int findMin(int[] mas) {
        int min = mas[0];

        for (int i = 0; i < mas.length; i++) {
            if(mas[i] < min){
                min = mas[i];
            }
        }

        return min;
    }

    public static int findMinIndex(int[] mas) {
        int minI = 0;

        for (int i = 0; i < mas.length; i++) {
            if(mas[i] < mas[minI]){
                minI = i;
            }
        }

        return minI;
    }

    public static int findMaxIndex(int[] mas) {
        int maxI = 0;

        for (int i = 0; i < mas.length; i++) {
            if(mas[i] < mas[maxI]){
                maxI = i;
            }
        }

        return maxI;
    }

    public static int findIndex(int[] mas, boolean isMax) {
        int maxI = 0;
        int minI = 0;

        for (int i = 0; i < mas.length; i++) {
            if(mas[i] > mas[maxI]){
                maxI = i;
            }

            if(mas[i] < mas[minI]){
                minI = i;
            }
        }

        if(isMax){
            return maxI;
        } else {
            return minI;
        }

        // return isMax ? maxI : minI;
    }

    public static int findMax(int[] mas) {
        int max = mas[0];

        for (int i = 0; i < mas.length; i++) {
            if(mas[i] > max){
                max = mas[i];
            }
        }

        return max;
    }

    // {}
    // {1}
    // {1,2,3}
    public static String convert(int[] mas) {
        if(mas == null || mas.length == 0){
            return "{}";
        }

        if(mas.length == 1){
            return "{" + mas[0] + "}";
        }

        String res = "{";
        for (int i = 0; i < mas.length; i++) {
            res += mas[i] + ",";
        }
        res += "}";

        return res;
    }

    public static void swap(int[] arr, int in1, int in2) {
        int temp = arr[in1];
        arr[in1] = arr[in2];
        arr[in2] = temp;
    }
}
