package practice.day03;

import java.util.Scanner;

public class Q05_StringManipulastion {
    /*
    kullanıcıdan isim ve soyismini girmesini isteyin
    hangisi daha uzun olduğunu yazdırın

     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Adınızı giriniz");
        String ad = scn.nextLine();
        System.out.println("SoyAdınızı giriniz");
        String soyAd= scn.nextLine();

        if(ad.length()>soyAd.length()){
            System.out.println("adınız soyadınızdan uzun "+ ad);
        } else if (ad.length()== soyAd.length()) {
            System.out.println("Adınız ve soy adınız eşit uzunlukta "+ad+" " +soyAd);
        }else
            System.out.println("Soy adınız isminizden uzu "+ soyAd);
    }
}
