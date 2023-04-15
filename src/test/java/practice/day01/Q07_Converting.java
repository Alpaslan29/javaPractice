package practice.day01;

import java.util.Scanner;

public class Q07_Converting {
    /*
    galonu litreye ceviren bir java programı yaziniz
    1 galon =3.785 litre
    litreyi galona ceviren bir java programı yazınız
    1lt = /3.785 galon

    sıcaklılıgı Fahrenyt tan santigrat derecesine çeviren bir java programı yazınız
    formül c=(f-32)*5/9
     */

    public static void main(String[] args ){


        double birGalonLitreKarsiligi= 3.785;
        int verilenGalon= 1000;
        System.out.println("verilenGalon = " + verilenGalon);

        double sonucLitre= birGalonLitreKarsiligi*verilenGalon;
        System.out.println("sonucLitre = " + sonucLitre);


        double verilenLitre=10;
        System.out.println("verilenLitre = " + verilenLitre);
        double sonucGalon= verilenLitre/birGalonLitreKarsiligi;
        System.out.println("sonucGalon = " + sonucGalon);

        Scanner scan =new Scanner(System.in);
        System.out.println("Fahrenayt degerini giriniz");
        double fhrtSicaklik= scan.nextDouble();
        System.out.println("fhrtSicaklik = " + fhrtSicaklik);
        double sntgrtSicaklik= (fhrtSicaklik-32)*5/9;
        System.out.println("sntgrtSicaklik = " + sntgrtSicaklik);

    }
}
