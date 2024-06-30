package ushtrimi1;

import java.util.Scanner;

public class Rrethi {
    public static void main (String []args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Jep diametrin ");
        float diametri= scanner.nextFloat();
        float rrezja= diametri/2;
        float perimetri= (float) (2*Math.PI*rrezja);
        double perimetri2=  (2*Math.PI*rrezja);
        //shohim qe kemi humbje vlerash kur konvertojme nga double ne float
        System.out.println("Perimetri float eshte " +perimetri);
        System.out.println("Perimetri double eshte " +perimetri2);
    }
}
