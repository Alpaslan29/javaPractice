package practice.day04;

import java.util.Scanner;

public class Q03_MethodCretion {
    /*
    kullanıcıdan alınan bir tam sayıyı (47 den küçük ) FIBONACCI dizisini olusturun.
    0-1-1-2-3-5-8-13-21-34....
     */

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        System.out.println("47 den kucuk bir sayı diriniz");

        int sayi= scn.nextInt();

        fibonacci(sayi);
    }

    private static void fibonacci(int sayi) {


      if(sayi<47){
          int sayi1 = 0;
          int sayi2 = 1;
          int sayi3;

          System.out.print(sayi1 +" ");
          System.out.print(sayi2 +" ");

          for (int i =2; i <sayi ; i++) {

              sayi3 = sayi1+sayi2;
              System.out.print(sayi3+ " ");
              sayi1= sayi2;
              sayi2 = sayi3;
          }
            
        }else System.out.println("47 den küçük bir sayı giriniz");
        
        
    }
}
