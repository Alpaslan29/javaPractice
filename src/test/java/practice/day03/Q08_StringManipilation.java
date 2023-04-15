package practice.day03;

import java.util.Scanner;

public class Q08_StringManipilation {
    /* basit 4 işlem yapan bir hesap makinası kodlayınız
    kullanıcıdan yapacagı işlemi işlem sembolü ile seçmesini sğlayınız 
    kullanıcıdan iki sayı girmesini isteyiniz 
    girilen iki sayı ve seçilen işleme göre doğru sunucu ekrana yazdırınız
    
     */

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("yapacagınız işlemi * + / - olarak seçiniz ");
        char islem= scn.next().charAt(0);

        System.out.println("işlem için bir sayı giriniz");
         double sayi1 = scn.nextDouble();
        System.out.println("işlem için ikinci sayı giriniz");
        double sayi2 = scn.nextDouble();
        
        hesapMakinasi(islem,sayi1,sayi2);
    }

    private static void hesapMakinasi(char islem, double sayi1, double sayi2) {
        if(islem=='*'|| islem=='/'|| islem == '-'|| islem=='+'){
            switch (islem){
                case '+':
                    System.out.println( sayi1 + "+" + sayi2+"=" + (sayi1+sayi2));
                    break;
                case '-':
                    System.out.println( sayi1 + "-" + sayi2+"=" + (sayi1-sayi2));
                    break;
                case '*':
                    System.out.println( sayi1 + "*" + sayi2+"=" + (sayi1*sayi2));
                    break;
                case '/':
                    System.out.println( sayi1 + "/" + sayi2+"=" + (sayi1/sayi2));
                    break;


            }
        }else System.out.println("hatalı giriş");
    }
/*
    private static void hesapMakinasi(char islem, double sayi1, double sayi2) {

        if(islem=='*'|| islem=='/'|| islem == '-'|| islem=='+'){
           if (islem=='+'){
               System.out.println( sayi1 + "+" + sayi2+"=" + (sayi1+sayi2));
            }
           if (islem=='-'){
               System.out.println( sayi1 + "-" + sayi2+"=" + (sayi1-sayi2));
           }
           if (islem=='*'){
               System.out.println( sayi1 + "*" + sayi2+"=" + (sayi1*sayi2));
           }
           if (islem== '/'){
               System.out.println( sayi1 + "/" + sayi2+"=" + (sayi1/sayi2));
           }

        }
        else System.out.println("hatalı giriş");
    }

 */

}