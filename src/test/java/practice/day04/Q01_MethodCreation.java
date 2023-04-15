package practice.day04;

public class Q01_MethodCreation {
    /*
    bir string içindeki tüm karakterleri enfazla bir kez yazdıran parametrli bir method yazınız
    test data
    input:"aabbcccccddddaaa"
    output: abcd
     */
    public static void main(String[] args) {
        String str = "aabbcccccddddaaa";

        tekSeferYazdir(str);

    }

    private static void tekSeferYazdir(String str) {
        String output ="";

        for (int i = 0; i < str.length(); i++) {

            if(!output.contains(str.substring(i,i+1))){
                output += str.substring(i,i+1);
            }

        }
        System.out.println(output);


    }
}
