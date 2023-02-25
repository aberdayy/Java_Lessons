import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

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
*/
//-------------- ARRAYLIST WITH CLASSES
/*
        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer(1,"ataberk","erday"));
        customers.add(new Customer(2,"Mert","Kasap"));
        customers.add(new Customer(3,"Onur","Karakaya"));
        customers.add(new Customer(4,"Cuneyt","Kandirmaz"));

    //  customers.remove(new Customer(1,"ataberk","erday")); //Referans numaralari ile calisildigi icin bu veri silinemez
        Customer ata = new Customer(5,"Ata","ERDAY");
        customers.add(ata);
        for(Customer customer : customers){
            System.out.println(customer.name);
        }

        System.out.println("-----------");
        //Silinen referans numarasi ayni oldugu icin yani newleme islemi yapmadigimiz icin bu veriyi kolaylikla silebiliriz.

        customers.remove(ata);
        for(Customer customer : customers){
            System.out.println(customer.name);
        }

*/
//-------------- HashMap => Dictionary
        HashMap<String,String> sozluk = new HashMap<String, String>();
        sozluk.put("book","kitap");
        sozluk.put("table","masa");
        sozluk.put("computer","bilgisayar");
        sozluk.put("cellphone","telefon");

        System.out.println(sozluk);

        System.out.println(sozluk.get("table"));
        System.out.println("\n");

        for (String item : sozluk.keySet()){
            System.out.println(item);
        }

        System.out.println("\n");
        for (String item : sozluk.keySet()){
            System.out.println("Eleman = " + item + " Deger = "+sozluk.get(item));
        }
        System.out.println("\n");

        sozluk.remove("table");
        System.out.println(sozluk.get("table"));

    }
}