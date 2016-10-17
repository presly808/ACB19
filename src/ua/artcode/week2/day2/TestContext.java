package ua.artcode.week2.day2;

/**
 * Created by serhii on 10/16/16.
 */
public class TestContext {

    public static void main(String[] args) {
        int a = 23;

        int b = 23;
        for (int i = 0; i < 23; i++) {

            b++;
        }

        testArg(a,b);


        if(true){
            //x++;

            if(true){
                for (int i = 0; i < 10; i++) {
                    i++;
                }
            }

            int x = 23;
        }

        //i++;
    }


    public static int testArg(int a, int b){
        return a + b;
    }
}
