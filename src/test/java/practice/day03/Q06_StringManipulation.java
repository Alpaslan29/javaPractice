package practice.day03;

import javax.swing.*;
import java.util.Scanner;

public class Q06_StringManipulation {
    //kullanıcıdan alacagınız bir string de boşluk karakterini olup olmadıgını kontrol ediniz .
    // kullanıcıdan alacagınız bir stringin bos olup olmadıgını kontrol ediniz.

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("String bir ifade giriniz");
        String kelime = scn.nextLine();

        int bosluk = kelime.indexOf(' ');

        if(bosluk==-1&& !(kelime.isEmpty())){
            System.out.println("bosluk yoktur");

        }else {
            System.out.println("boşluk vardır");
        }

    }
}
