package practice.day01;

public class Q04_JavaVarible {
    public static void main(String[] args) {

        int yas = 43;
        double boy = 1.79;

        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);


        int yasim = 43;
        int enesYas = yasim;

        System.out.println("enesYas = " + enesYas);
        System.out.println("yasim = " + yasim);


        int yil = 2023, ay = 3, gun = 23;

        System.out.println("yil = " + yil);

        yil = 2032;

        System.out.println("update yil: " + yil);


        // bir degisken tanımlayın:x
        // baska bir degiskeni initialize edin : y
        // x  degiskenini intialize edin
        // y degiskenini yeni bir degerle güncelleyin

        int x; // deklarasyon
        int y = 2000;// initialize asingment
        System.out.println("y = " + y);// önce bu degeri yazar yukardan aasagı isledigi icin

        x=30;// inşilayz

        y=1; // güncelleme

        System.out.println("x = " + x);
        System.out.println("y = " + y);



    }


}
