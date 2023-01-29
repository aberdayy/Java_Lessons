public class StudentCreditManager extends BaseCreditManager {
    //hesapla ayni sekilde ayni isimle kullanildigi icin override edilir ve inherit ederken ezer.
    public double hesapla(double tutar) {
        return tutar * 1.10;
    }
}
