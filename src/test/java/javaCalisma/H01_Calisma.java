package javaCalisma;

import java.util.Scanner;

public class H01_Calisma {

    public static void main(String[] args) {
        /*
        Soru1: String tipinde sabit bir şifre değişkeni oluşturun. Örneğin: String password = “12345”; gibi.
         Ardından, kullanıcıdan klavyeden bir şifre girmesini isteyin.
          Girilen şifre ile değişkende tuttuğunuz değeri kıyaslayın.
          Eğer, iki değer birbirine eşitse ekrana “Giriş Başarılı!”,
          değilse “Giriş Başarısız” yazdırın.
         */

        Scanner scn = new Scanner(System.in);
        String sifre ="Za1324";
        System.out.println("Şifre giriniz");

        String girilenSifre= scn.nextLine();

        if (girilenSifre.equals(sifre)){
            System.out.println("Giriş Başarılı");
            }else
            System.out.println("Giriş Başarısız");



    }
}
