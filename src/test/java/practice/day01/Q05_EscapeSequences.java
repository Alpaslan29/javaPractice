package practice.day01;

public class Q05_EscapeSequences {

    /*
    yazdırılamayan karakterliri karakter ve dize değişmezlerine koymak için kullanılırlar
    örneğin sekme, satır başı ve deri alma gibi karakterleri bir çıkış akışına koymak için kaçışdizileri kullanılır
    \n(or\r):  metni bir alt satırdan itibaren yazdırır.
           \t: metni yatayda 1 tab miktari kaydırır
           \\: \ (ters slash) yazdırır
           \': tek tırnak yazdırır
           \" : çift tırnak yazdırır

           \ : backslash
           /: front slash
     */

    public static void main(String[] args){
        // soru 1 konsola "Hello","World \ //" şeklinde yazdırınız

        System.out.println("\"Hello \", \"World \\ //\"");

        System.out.println("\"\t\\\'\"");


        // soru  2 Pazartesi kelimesinin her harfini ayri bir satıra gelecek şekilde yazdırınız.
        System.out.println("P\na\nz\na\nr\nt\ne\ns\ni\n");


        //  soru 3 "Java" ile hayat çok afilli yazdiriniz
        System.out.println("\"Java\" ile hayat çok afilli");

        // soru 4 "Zaruret" insani
        //         'kasif' yapar yazdiriniz
        // sonraki "TechProEd ile java cok kolay..." 3 satırsonra ve satır basında 1 tab ileride yazilsin , hepsi tek kod satırında olacak

        System.out.println("\"Zaruret\" insani\n \'kasif\' yapar \n\n\n\t\"TechProEd ile java cok kolay...\"");

    }
}
