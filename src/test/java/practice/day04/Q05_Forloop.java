package practice.day04;

public class Q05_Forloop {
    // 0- 255 e kadar olan harflerin sayi ve harf degerlerini yazdırınız.

    public static void main(String[] args) {
        System.out.println("for ile");


       // for (int i = 0; i <=255 ; i++) {
//
       //     char c = (char) i; // cating yaptık sayı harf ve karakter
       //     System.out.println(i +" ->"+c );
//
       // }
       // System.out.println("while ile");
       // int i =0;
       // while (i<=255){
       //     char sembol = (char) i;
       //     System.out.println(i+" -"+ sembol);
       //     i++;
//
//
       // }
//
        System.out.println("do while ile "); // ik satırı çalıştırır  sonra dögüye girer

        int a =0;

        do{
            char karakter= (char) a;
            System.out.println(a + " " + karakter);
            a++;

        }while (a<255);



    }
}
