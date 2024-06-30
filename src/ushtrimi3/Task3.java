package ushtrimi3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.println("Jep vleren e a: ");
        a = scanner.nextInt();

        System.out.println("Jep vleren e b: ");
        b = scanner.nextInt();

        System.out.println("Jep vleren e c: ");
        c = scanner.nextInt();

        double delta = Math.pow(b,2) - 4*a*c;

        if (delta < 0){
            System.out.println("Dallori negativ, ekuacioni nuk ka zgjidhje!");
        } else if (delta > 0) {
            //x1 != x2
            double x1 = (-b-Math.sqrt(delta))/(2*a);
            double x2 = (-b+Math.sqrt(delta))/(2*a);
            System.out.println("Ekuacioni ka dy rrenje: ");
            System.out.println("X1: " + x1);
            System.out.println("X2: " + x2);
        }else {
            //x1 == x2
            double x1 = (-b-Math.sqrt(delta))/(2*a);
            System.out.println("Ekuacioni ka nje rrenje: ");
            System.out.println("X1 == X2 : " + x1);
        }
    }
}
