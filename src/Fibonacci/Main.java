package fibo;
import Fibonacci.Fibonacci;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vendosni nje numer te plote pozitiv ose 0 : ");
        int index = scanner.nextInt();
        if (index >= 0) {
            int numri = Fibonacci.fibo(index);
            System.out.print("Numri ne index: " + index+ " " +
                    ": " + numri);
        } else {
            System.out.println("Numri qe vendoset nuk eshte i sakte.");
        }
    }
}