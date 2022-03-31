package Projects.UcusYeni;

import java.util.Scanner;

import static Projects.UcusYeni.YasKontrol.YasKontrol;



public class Kimlik {
    static String ad;
    static String soyAd = "";

    public static void Kimlik() {
        Scanner scan = new Scanner(System.in);
        System.out.println("*************Lutfen Kimlik Bilgilerinizi Girinizr**************");
        System.out.print("Adiniz.............: ");
        ad = scan.nextLine().toUpperCase();
        System.out.print("Soyadiniz..........: ");
        soyAd = scan.nextLine().toUpperCase();
        //YasKontrol();
    }

}
