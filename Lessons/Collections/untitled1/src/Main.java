import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        /*
        int[] sayilar = new int[]{1,2,3};
        sayilar = new int [4];
    //  System.out.println(sayilar[0]);

        ArrayList sayilar2 = new ArrayList();
        sayilar2.add(1);
        sayilar2.add(10);
        sayilar2.add("ankara");
    //  sayilar2.add(22,"Istanbul Index Elemani"); // 22. index evcut olmadigi icin hata dondurur.
        sayilar2.set(0,100);

        System.out.println(sayilar2.get(0));
        sayilar2.remove(0);
        System.out.println(sayilar2.get(0));
    //  sayilar2.clear(); //Tum elemanlari siler.

        for (Object i : sayilar2){
            System.out.println(i);
        }
*/
//--------------SAFETYPE ARRAYLIST
        ArrayList<String> sehirler = new ArrayList<String>();
        sehirler.add("Istanbul");
        sehirler.add("Izmir");
        sehirler.add("Ankara");
        sehirler.add("Balikesir");
        sehirler.add("Yalova");
        Collections.sort(sehirler);

        for (String s : sehirler){
            System.out.println(s);
        }


    }
}