package practice.day01;

public class Q06_Avarege {

    /*
    double num1 = 23.4;
    double num2 = 24.0;
    double num3 = 12;
    double num4 = 450.3;
    double num5 = 23000;
      bu double sayıların ortalamasını bulunuz
       
     */
    
    public static void main(String[] args){


        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 23000;

        double toplama = num1+num2+num3+num4+num5;
        double ortalama = toplama/5;
        double ortalama1= (num1+num2+num3+num4+num5)/5;

        System.out.println("ortalama = " + ortalama);
        System.out.println("ortalama1 = " + ortalama1);
        
        
    }
            
}
