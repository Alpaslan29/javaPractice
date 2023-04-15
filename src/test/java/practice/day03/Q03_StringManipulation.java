package practice.day03;

import java.util.Scanner;

public class Q03_StringManipulation {
    /*
    name1 ve name2 değişkenleri oluşturun
    name1 değişkeninin karakter sayisi cift ise kelimenin ortasına name2 yi yerleştirin
    name1 değişkeninin karakter sayısı tek ise "name cift sayili olmadiği için ortsina yerleştiremedik" yazalım

    e.g :
    name1 mehmet
    name2 ahmet
    Print ==> mehahmetmet
     */
    public static void main(String[]args){

        Scanner scn = new Scanner(System.in);
        System.out.println("Bir isim giriniz");
        String name1= scn.nextLine().toLowerCase();
        System.out.println("ikinci isim giriniz ");
        String name2 = scn.nextLine().toLowerCase();

        if(name1.length()%2==0){
            System.out.println(name1.substring(0,name1.length()/2).concat(name2).concat(name1.substring(name1.length()/2)));
        }else
            System.out.println("name cift sayili olmadiği için ortsina yerleştiremedik");
    }
}
