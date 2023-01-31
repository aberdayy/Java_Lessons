public class Main {
    public static void main(String[] args) {
        //interfacelerde abstract gibi new lenemez.
        //referans tutabilir
        // Interface operasyon implemente edilecekse ve ayri ayri yapilmasi gerekiyorsa kullanilir ozellikle
        // Data access layer -> Kontrol kisimlari -> arayuz
        // dal ve controller baglantilari genelikle interface ile olur bagimliligi azaltmak icin

        ICustomerDal customerDal = new OracleCustomerDal();
        customerDal.add();


    }
}