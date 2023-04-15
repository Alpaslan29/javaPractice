package practice.day5;

import java.util.Scanner;

public class Q05_Forloop {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Satır sayısını giriniz ");
         int satirSayisi= scn.nextInt();
        System.out.println("Sütün sayısını giriniz ");
        int sutunSayisi = scn.nextInt();


        for (int i = 1; i <=satirSayisi ; i++) {
            for (int j = 1; j <sutunSayisi ; j++) {
                System.out.print("* ");

            }
            System.out.println("* ");

        }

    }
}
