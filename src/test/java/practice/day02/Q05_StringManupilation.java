package practice.day02;

import java.util.Scanner;

public class Q05_StringManupilation {
    public static void main(String[] args) {

        // kullanıcıdan ismini ve soy ismini girmesini isteyin sonrasında tam ismini büyük harflerle yazdırın
        Scanner scn = new Scanner(System.in);
        System.out.println("İsmizi ve soyismizi yazınız");
        String isim =scn.nextLine(),
        soyIsim= scn.nextLine();
        String tamIsim= isim.concat(" "+ soyIsim).toUpperCase();


        System.out.println(tamIsim);


    }
}
