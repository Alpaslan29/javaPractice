package practice.day5;

import java.util.Scanner;

public class Q03_Forloop {

    /*
    kullanıcdan 1 den büyük  bir tamsayı girmesini isteyiniz
    ve 1 den girilrn tamsayı kadar sayıların karalerinini toplamını hesaplayan kodu yazınız
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("birden büyük tamsaı giriniz");
        int sayi = scn.nextInt();
        int sonuc = 0;

        if (sayi>1){
            for (int i = 0; i <sayi ; i++) {

                sonuc+=i*i;

            }
            System.out.println("sayıların karaleri toplamı: "+ sonuc);
        }
        System.out.println("yanlış sayı girdiniz");

    }
}
