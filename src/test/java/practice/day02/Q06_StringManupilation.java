package practice.day02;

import java.util.Scanner;

public class Q06_StringManupilation {
    // Scanner kullanarak iki ayrı deger giriniz ve bu iki kelimeyi String manipulation method kullanarak birlestiriniz
    // yukarıdaki örnekte verilen ilk ve ikinci değiskenlerin ilk harflerini atıp birlestiriniz

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("isminizi ve soyisminizi giriniz");
        String isim =scn.nextLine(), soyIsim=scn.nextLine();
        // 1. yöntem
        System.out.println(isim+ " "+ soyIsim);
        // 2. yöntem
        System.out.println(isim.concat(" "+soyIsim));

        System.out.println(isim.substring(1)+" "+soyIsim.substring(1));






    }
}
