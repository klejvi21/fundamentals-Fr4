package perseritje;

import java.util.Scanner;

public class SwitchCases {
    public static void main (String[] args){
        System.out.print("Logjik kodi");
    double vlera= llogarit();
    System.out.print(vlera);
    System.out.print("Logjik kodi");

    }
    public static double llogarit(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vendos numrin e pare");
        float numri1= scanner.nextFloat();
        System.out.print("Vendos operatorin");
        char operatori= scanner.next().charAt(0);
        System.out.print("Vendos numrin e dyte");
        float numri2= scanner.nextFloat();
        switch(operatori){
            case'+':
                return numri1+numri2;

            case '-':
                return numri1-numri2;

            case '*':
                return numri1*numri2;

            case'/':
                if (numri2== 0) {
                    System.out.print("Pjestimi me 0 nuk ka kuptim");
                    return Integer.MIN_VALUE;
                }
                else {
                    return numri1 / numri2;
                }
            default:
                System.out.print("Invalid operator!");
        }
        return Integer.MIN_VALUE;
    }
}
