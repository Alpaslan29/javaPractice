package practice.day01;

import java.util.Scanner;

public class Q08_Scanner01 {
    /*
    kullanıcıdan 2 tam sayı alın
    bu tam sayıların toplayın ve sonucu yazdırın
     */
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci tamsayıyı giriniz");
        int ilkTamsayi= scan.nextInt();
        System.out.println("İkinci tamsayıyı giriniz");
        int ikinciTamsayi= scan.nextInt();

        int toplam = ilkTamsayi+ikinciTamsayi;
        System.out.println("Toplam = " + toplam);

        int cikarma = ilkTamsayi-ikinciTamsayi;
        System.out.println("cikarma = " + cikarma);

        int carpma = ilkTamsayi*ikinciTamsayi;
        System.out.println("carpma = " + carpma);

        int bolme = ilkTamsayi/ikinciTamsayi;
        System.out.println("bolme = " + bolme);




    }
}
