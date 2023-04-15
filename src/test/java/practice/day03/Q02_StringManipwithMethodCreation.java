package practice.day03;

import java.util.Scanner;

public class Q02_StringManipwithMethodCreation {
    /*
    girilen string icinde "xyz" dizimi var ise true deise false return method yazınız
    input       output
    axyzm   == true
    xyz     == true
    x.yz    == false
    xyaz    == false

     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String kelime = scn.nextLine().toLowerCase();

        System.out.println(xyzVarmi(kelime));

    }

    private static boolean xyzVarmi(String kelime) {

        if (kelime.contains("xyz")){
            return true;
        }else
            return false;
    }
}
