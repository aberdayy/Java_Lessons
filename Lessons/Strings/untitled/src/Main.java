import java.net.SocketOption;
import java.security.spec.RSAOtherPrimeInfo;

public class Main {
    public static void main(String[] args) {
        String mesaj = "    Selam olsun hepinize sevgili dunya";
        int a = mesaj.length();
        char b = mesaj.charAt(4);
        String c = mesaj.concat(" YASASIN !!! ");
        boolean d = mesaj.startsWith("S");
        boolean e = mesaj.endsWith(".");
        char[] karakterler = new char[5]; // Verilen deger fazla ise (5 deger varken 6 verirsen) null dondurur.
        mesaj.getChars(0,5,karakterler,0);
        int f = mesaj.indexOf("a");
        int g = mesaj.lastIndexOf("a");
        String h = mesaj.replace(' ', '-');
        String i = mesaj.substring(2);
        String j = mesaj.substring(2,5);
        String k = mesaj.toUpperCase();
        String l = mesaj.trim();
        //Print To Screen
        System.out.println(a);
        System.out.println("5. Eleman : " + b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(karakterler);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
        for(String content : mesaj.split(" ")){
            System.out.println(content);
        }
        System.out.println(k);
        System.out.println(l);



    }
}