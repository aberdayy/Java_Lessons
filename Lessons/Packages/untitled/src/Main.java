//built-in packages

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adinizi giriniz : ");

        String Isim = scanner.nextLine();
        System.out.println("Merhaba " + Isim);
    }
}