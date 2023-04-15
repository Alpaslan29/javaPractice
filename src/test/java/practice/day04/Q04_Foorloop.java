package practice.day04;

public class Q04_Foorloop {

    /*
    100 den 0 akadar 13 e tam bölüne blilen sayıları ekrana yazdırınız büyükten küçüğe yyazdırınız ayrıca çıkan sonuçlar toplayınız


     */

    public static void main(String[] args) {

        int toplam =0;
        System.out.println("istenen sonuç: " );

        for (int i = 100; i >=0 ; i--) {

            if (i%13==0){
                System.out.println(i);
                toplam +=i;
            }


        }
        System.out.println();
        System.out.println("toplam = " + toplam);

    }
}
