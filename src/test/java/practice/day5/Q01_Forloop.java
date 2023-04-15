package practice.day5;

import java.util.Scanner;

public class Q01_Forloop {
    /*
    kullanıcaıdan bir harf girmesini isteyiniz girilen harf sesli ise sesli harf oldugunu,
    degilse sessi harf ise hata mesajı göstersin girdiği deger harf degilse yada 1 karakterden fazla ise hata mesajı göstersin
    (test girilen harfi büyük yada küçüklüğene duyarlıdır
    sesli harfler: a,e,i,o,u
     */

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("lütfen bir harf giriniz");

        String harf= scn.nextLine().toLowerCase();
        String sesliHarfler= "aeiou";
        String sessizHarfler= "bcdfghjklmnpqrstuvwxyz";

        if(harf.length()==1){
            for (int i = 0; i <sesliHarfler.length() ; i++) {
                if (sesliHarfler.contains(harf)){
                    System.out.println("sesli harf");
                    break;

                } else if (sessizHarfler.contains(harf)) {
                    System.out.println("sessiz harf");
                    break;

                }else {
                    System.out.println("yanlış karakter girdiniz");
                    break;
                }

            }

        }else System.out.println("tek karakter giriniz");





    }
}
