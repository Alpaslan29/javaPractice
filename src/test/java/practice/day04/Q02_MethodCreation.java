package practice.day04;

import java.util.Scanner;

public class Q02_MethodCreation {
    /*
    cm olarak bir sayiyi metre ve kilometre dönüştüren method yazınız

     */

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("metre ve km dönüştürmek istediğiniz cm değerini giriniz ");
        double santiMeterValue = scn.nextDouble();

        convertCm(santiMeterValue);



    }

    public static void convertCm(double santiMeterValue) {
        double meter= santiMeterValue/100;
        double kMeter= santiMeterValue/100000;

        System.out.println("giridiğiiniz santimetre değeri " + santiMeterValue+ "cm dir " + meter+ "m dir,"+ kMeter+"km dir");




    }
}
