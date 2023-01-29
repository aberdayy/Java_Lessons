public class BaseCreditManager {
    // eger final key wordu kullanirsa override islemini engellemis oluruz
    public final double hesapla(double tutar){
        return tutar * 1.18;
    }

}
