package practice.day04;

public class H5_calisma {

    public static void main(String[] args) {
        for (int i = 10; i >=1 ; i--) {

            for (int j = 0; j <=i ; j++) {
                System.out.print(  "*");

            }
            System.out.println();

        }


        for (int a = 1; a <=10 ; a++) {
            System.out.print(a);
            for (int b= 10; b >a ; b--) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
