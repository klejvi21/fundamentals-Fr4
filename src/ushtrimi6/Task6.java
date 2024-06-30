package ushtrimi6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Vendos numrin");
        int numri= scanner.nextInt();
        double sum=0;
        for (int i= 1; i<numri; i++){
        sum=sum+ (double) 1 /i;
        }
        System.out.println(sum);
    }
}
