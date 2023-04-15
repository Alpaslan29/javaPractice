package practice.day5;

import java.util.Scanner;

public class Q02_Forloop {
    /*
    kullanıcıdan 1 den büyük bir tam sayı girmesini isteyin  ve 1 den girilen tam sayıya kadar olan sayıların
    karelerinin toplamını hesaplayan kodu yazınız
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("1 den büyük bir tam sayı giriniz");
        int sayi= scn.nextInt();
        int toplam=0;

        if(sayi>1){

            for (int i = 1; i <sayi ; i++) {
               toplam+=(i*i);


            }
            System.out.println("sayıların karaleri toplamı: " +toplam);
        }else System.out.println("yanlış sayı giridiniz");

    }
}
