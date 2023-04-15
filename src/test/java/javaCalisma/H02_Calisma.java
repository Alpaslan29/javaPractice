package javaCalisma;

import java.util.Scanner;

public class H02_Calisma {
    public static void main(String[] args) {
        /*Soru2: Kullanıcının konsol ekrandan 4 temel matematiksel işlemi yapabildiği bir program yazmanız bekleniyor.
         Program aşağıdaki özellikleri sağlamalıdır.

            Yapılabilecek temel işlemler: Toplama, Çıkarma, Çarpma, Bölme
            Kullanıcıya 4 işlemden birini seçeceği menüyü konsol ekrana yazdırın. Örneğin: 1-Toplama, 2-Çıkarma vb…
            Ardından kullanıcıdan 2 adet tamsayı tipinde sayı girmesini isteyin. Bu girilen iki sayıyı değişkenlerde saklayın.
            Seçilen işlem tipine göre matematiksel işlemi yapın ve konsol ekranına yazdırın.

         */
        Scanner islemSecimi = new Scanner(System.in);
        System.out.println("Yapacağınız temel işlemler");
        System.out.println("1- Toplama");
        System.out.println("2- Cikarma");
        System.out.println("3- Carpma");
        System.out.println("4- Bölme");
        System.out.println("Lütfen Yapmak istediğiniz işlemin numarasını giriniz");
        int islem = islemSecimi.nextInt();
        Scanner scn = new Scanner(System.in);
        System.out.println("birtamsayı giriniz");
        int tamsayi1 = scn.nextInt();
        System.out.println("ikinci tamsayiyi giriniz");
        int tamsayi2 =scn.nextInt();

        int sonucToplama= tamsayi1+tamsayi2;
        int sonucCikarma = tamsayi1-tamsayi2;
        int sonucCarpma = tamsayi1*tamsayi2;
        double sonucBolme = tamsayi1/tamsayi2;

        if (islem==1){
            System.out.println("toplama ileminin sonucu" + sonucToplama);
        } else if (islem==2) {
            System.out.println("Çıkarma işleminin sonuçu" +sonucCikarma);

        } else if (islem==3) {
            System.out.println("Çarpma işleminin sonucu " + sonucCarpma);

        } else if (islem==4) {
            if (tamsayi2==0){
                System.out.println("bisayı sıfıra bölünemez");
            }else{
                System.out.println("Bölme İşleminin sonucu " + sonucBolme);

            }

        }else {
            System.out.println("geçersiz bir işlem seçtiniz");
        }



    }
}
