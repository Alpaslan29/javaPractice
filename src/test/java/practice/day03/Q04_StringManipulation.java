package practice.day03;

import java.util.Scanner;

public class Q04_StringManipulation {
    /*
    kullanıcıdan bir kelime girmesini isteyin
    * sözcükte teksayıda karakter ve 3 veya daha fazla karekter içeriyorsa
    * kelimenin ortasındaki karakteri yazdırın

     */
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String kelime = scn.nextLine();
        char ortancaKarakter= kelime.charAt((kelime.length()-1)/2);

        if(kelime.length()%2==1&& kelime.length()>=3 ){
            System.out.println("ortancakarakter = " + ortancaKarakter);

        }else
            System.out.println("tek sayı karakterli kelime giriniz");
    }
}
