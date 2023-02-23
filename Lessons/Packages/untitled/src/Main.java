//built-in packages
// import matematik.*;
// yukaridaki * isaretli import islemi paket icerisindeki tum classlari kullanmamiza olanak saglar.
import matematik.DortIslem;
import matematik.Logaritma;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adinizi giriniz : ");

        String Isim = scanner.nextLine();
        System.out.println("Merhaba " + Isim);

        DortIslem dortIslem = new DortIslem();
        dortIslem.Topla(2,3);

        Logaritma logaritma = new Logaritma();
        logaritma.LogaritmaHesapla();

    }
}