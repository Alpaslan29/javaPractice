package practice.day03;

import java.util.Scanner;

public class Q07_StringManipulation {
    /*
    kullanıcıdan 4 harfli bir kelime isteyiniz
    ve girilen kelimeyi tersden yazdırın
     */
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        String kelime = scn.next();
        System.out.println(kelime.length());

        if (kelime.length() == 4){
            char bir =kelime.charAt(0);
            char iki = kelime.charAt(1);
            char uc = kelime .charAt(2);
            char dort = kelime.charAt(3);
            System.out.println("Tersden :"+ dort +uc+ iki + bir);

        } else {
            System.out.println("girdiginiz kelime uzunlugu 4 karakterden farklı");
        }
    }
}
