public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[] {
            1, 2, 5, 7, 8, 0, 9
        };
        int aranacakSayi =  9;
        boolean sonuc = false;
        for(int sayi : sayilar){
            if (sayi==aranacakSayi){
                sonuc=true;
                break;
            }
        }
        if (sonuc){
            System.out.println("sayi mevcut");
        }else{
            System.out.println("Sayi mevcut degil");
        }

    }
}