package practice.day04;

public class H1_calisma {

    /*
    1 den 5 kadara olan sayıların karalerini ekrana yazdırın
     */

    public static void main(String[] args) {

        for (int i = 1; i <=5 ; i++) {

            System.out.println(i*i);

        }


        int i=1;

        while (i<=5){
            System.out.println(i*i);

            i++;
        }

        int a =1;

        do{
            System.out.println(a*a);
            a++;

        }while (a<=5);
    }

}
