import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
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

    }
}