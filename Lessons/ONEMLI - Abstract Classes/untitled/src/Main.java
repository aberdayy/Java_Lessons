public class Main {
    public static void main(String[] args) {
        // abstract classlar normal classlar ile ayni kurallara sahiptir.
        // abstract operasyonu icin abstract belirtilmeli
        // abstract sinif asla newlenemez!! islemlerinin ezilmesi gerekir
        // referans tutabilir.

        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.gameOver();

        GameCalculator gameCalculator = new ManGameCalculator();
        gameCalculator.hesapla();

    }
}