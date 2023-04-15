package practice.day02;

public class Q07_StringManipulation {
    /*
    String seklinde verilen asagidaki fiyatlarin toplamini bululnuz
    String str1 = "$13.99"
    String str2 = "$10.55"
    ipucu Double parseDouble () methodunu kullanabilirsiniz.


     */
    public static void main(String[] args) {
        String str1 = "$13.99"; str1= str1.replaceAll("\\D","");
        String str2 = "$10.55"; str2 = str2 .replaceAll("\\D","");

        System.out.println("str1 = " + str1);//
        System.out.println("str2 = " + str2);

        System.out.println(str1+str2);

        double sayi1= Double.parseDouble(str1);
        double sayi2 = Double.parseDouble(str2);
        double toplam = (sayi1+sayi2)/100;

        System.out.println("toplam = " +"$"+ toplam);


    }


}
