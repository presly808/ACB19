package ua.artcode.home2;

import ua.artcode.utils.ArrayUtils;

/**
 * Найти минимальное и максимальное значения в массиве и вывести их на консоль
 */
public class Task1 {

    public static void main(String[] args) {
        // generate arr
        int[] mas = ArrayUtils.createRandomArr(10, 10);
        ArrayUtils.printArr(mas); // printArr(arr:int[]): void
        // out arr
        // find min
        int min = ArrayUtils.findMin(mas);
        System.out.println("min = " + min);
        // out min
        // find max
        int max = ArrayUtils.findMax(mas);
        System.out.println("max = " + max);
        // out max

        String arrStr = ArrayUtils.convert(mas);
        String formtted = arrStr.replace('[', '{').replace(']','}');
        System.out.println(arrStr);
        System.out.println(formtted);
    }




}
