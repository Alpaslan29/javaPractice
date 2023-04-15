package practice.day5;

import java.util.Scanner;

public class Q04_MetCretionForloop {
    /*
    kullanıcıdan aldığın string bir ifadeyi tersine yazdıran method creat ederek forloopla kullanarak bir kod yaz

     */

    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("String bir ifade girininiz");
        String kelime = scn.nextLine().toLowerCase();


        System.out.println("kelinmenin tersi = " + tersineCevir(kelime));
    }

    private static String tersineCevir(String kelime) {
        String tersi ="";
        for (int i = kelime.length()-1; i >=0 ; i--) {
           tersi+=kelime.charAt(i);

        }

        return tersi;
    }


}