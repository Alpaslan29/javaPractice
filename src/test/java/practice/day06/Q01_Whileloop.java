package practice.day06;

import java.util.Scanner;

public class Q01_Whileloop {

    // girilen sayının basamaklarındaki ramakların toplamı

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("iki ve daha çok basamaklı bir sayı giriniz");
        int sayi = scn.nextInt();


        System.out.println("basamakToplama = " + basamakToplama(sayi));
    }

    private static int basamakToplama(int sayi) {
        int toplam =0;
        while (sayi!=0){
            toplam+=sayi%10;
            sayi/=10;
        }
        return toplam;

    }
}
