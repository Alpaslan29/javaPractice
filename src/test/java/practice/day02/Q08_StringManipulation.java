package practice.day02;

import java.util.Scanner;

public class Q08_StringManipulation {
    /*
    kullanıcıdan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
    iki harfini  3 kere yan yana yazdırın değilse girilinen kelimeyi yazdırın.
     */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Bir kelime giriniz");
        String kelime = scn.nextLine();

        if (kelime.length()>=3){
            System.out.println(kelime.substring(kelime.length()-2) + kelime.substring(kelime.length()-2 )+
                    kelime.substring(kelime.length()-2));


        }else{
            System.out.println(kelime);

        }

    }
}
