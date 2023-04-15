package practice.day5;

import java.util.Scanner;

public class P01_calisma {



       /* public static int FirstFactorial(int num) {



            return num;
        }

        */

        public static void main (String[] args) {
            Scanner s =new Scanner(System.in);
            System.out.println("pozitif bir tamsayı giriniz");
            int num = s.nextInt();
            int sonuc=1;

            // keep this function call here
           // Scanner s = new Scanner(System.in);
           // System.out.print(FirstFactorial(s.nextLine()));

            if(num>0){
                for (int i = 1; i <=num ; i++) {
                    sonuc *=i;
                }
                System.out.println("sonuc = " + sonuc);
            }
            System.out.println("pozitif tam sayı giriniz");
        }

    }
