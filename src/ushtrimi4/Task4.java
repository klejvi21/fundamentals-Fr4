package ushtrimi4;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        System.out.println("Jep numrin : ");
        int numri = scanner.nextInt();
        for ( int i = 1 ; i <= numri ; i++ ) {
            if ( i % 7 == 0 && i % 3==0 ) {
                System.out.println("Fizz Buzz");
            }
            else if ( i % 3 == 0 ) {
                System.out.println("Fizz ");
            }
            else if ( i % 7 == 0 ) {
                System.out.println("Buzz");
            }
            else  {
                System.out.println(i);
            }
        }
    }
}
