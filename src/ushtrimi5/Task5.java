package ushtrimi5;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.println("Shfaq numrin");
                int numri = s.nextInt();
                for (int i = 2 ; i<numri ;i++ ) {
                    if (isPrime (i)){
                        System.out.println(i);

                    }
                }

}
public static boolean isPrime(int numri) {
    for (int i = 2; i < numri; i++) {
        if (numri % i == 0) {
            return false;
        }
    }
    return true;
}
}


