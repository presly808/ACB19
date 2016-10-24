package ua.artcode.home2;

import ua.artcode.utils.ArrayUtils;

/**
 * Created by serhii on 10/22/16.
 */
public class Task2 {


    public static void main(String[] args) {
        int[] arr = ArrayUtils.createRandomArr(20, 100);
        System.out.println(ArrayUtils.convert(arr));

        int minI = ArrayUtils.findIndex(arr,false);
        System.out.println("minI " + minI);
        int maxI = ArrayUtils.findIndex(arr,true);
        System.out.println("maxI " + maxI);

        ArrayUtils.swap(arr, minI, maxI);

        System.out.println(ArrayUtils.convert(arr));
    }
}
