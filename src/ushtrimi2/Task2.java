package ushtrimi2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        //marrim input nga user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jep gjatesine: ");
        int gjatesia = scanner.nextInt();

        System.out.println("Jep peshen: ");
        float pesha = scanner.nextFloat();

        double gjatesiad = ((double) gjatesia )/100;
        System.out.println("Gjatesiad: " + gjatesiad);
        gjatesiad = Math.pow(gjatesiad,2);
        System.out.println("Gjatesiad ne katror: " + gjatesiad);

        double BMI = pesha / gjatesiad;
        System.out.println("BMI: " + BMI);

        if (BMI < 18.5){
            System.out.println("Nenpeshe!");
        }else if (BMI >= 18.5 && BMI <= 24.5){
            System.out.println("BMI Ideale!");
        }else {
            System.out.println("mbipeshe!");
        }

    }
}
