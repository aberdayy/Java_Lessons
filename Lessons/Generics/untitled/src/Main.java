import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
  // ==========Bu bir array listtir.
  //Generic class lar array listlerin ilkel halidir. Kendi arraylistimizi generic classlar sayesinde yazabiliriz.
        ArrayList<String> sehirler = new ArrayList<String>();
        sehirler.add("Ankara");
        sehirler.add("Istanbul");
        sehirler.add("Izmir");
*/
        MyList<String> sehirler = new MyList<>();
        sehirler.add("Ankara");
        sehirler.add("Istanbul");
        // sehirler.add(1); //Hata dondurur cunku tipki arraylistte oldugu gibi String tipinde oldugunu belirttik.

        //tipki arraylist gibi bunun benzeri islemlerde yapilabilir.
        MyList<Customer> musteriler = new MyList<>();
        musteriler.add(new Customer());
        musteriler.add(new Customer());




    }
}