package practice.day03;

import java.util.Scanner;

public class Q01_StringManipulation {

    /*
    kullanıcıdan 4 kelime isteyin ve cumle olarak yazdırıp .

     */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Cümle olşturmak için Birinci kelimeyi giriniz");
        String kelime1 = scn.nextLine().toLowerCase();
        System.out.println("Cümle olşturmak için ikinci kelimeyi giriniz");
        String kelime2= scn.nextLine().toLowerCase();
        System.out.println("Cümle olşturmak için üçüncü kelimeyi giriniz");
        String kelime3= scn.nextLine().toLowerCase();
        System.out.println("Cümle olşturmak için dördüncü kelimeyi giriniz");
        String kelime4= scn.nextLine().toLowerCase();

        String kelime5=".";


        System.out.println(kelime1.substring(0,1).toUpperCase()+kelime1.substring(1)+" "+kelime2+" "+kelime3+" "+kelime4+" "+kelime5);

    }
}
