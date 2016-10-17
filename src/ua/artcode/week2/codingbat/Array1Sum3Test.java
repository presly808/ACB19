package ua.artcode.week2.codingbat;

/**
 * Created by serhii on 10/15/16.
 */
public class Array1Sum3Test {

    // call
    public static void main(String[] args) {
        int a = 23;
        int[] in1 = {1,2,3};
        int expected1 = 6;
        char[] arr = {};

        int actual1 = Array1Methods.sum3(in1);

        if(expected1 == actual1){
            System.out.println(true);
        }
        System.out.println("[1,2,3] -> 6, " + actual1);

    }



}
