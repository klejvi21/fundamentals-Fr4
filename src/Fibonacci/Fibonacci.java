package Fibonacci;


public class Fibonacci {

    public static int fibo(int index){
        if (index == 0){
            return 0;
        }
        if (index == 1){
            return 1;
        }

        int first = 0;
        int second = 1;

        for (int i = 0 ; i < index - 1 ; i++){
            int third = first + second;
            first = second;
            second = third;
        }

        return second;
    }
}
