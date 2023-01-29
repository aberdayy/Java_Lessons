public class Main {
    public static void main(String[] args) {
        //sayiyi tam bolen(kalansiz) sayilarin toplami sayinin kendisine esittir.

        int number = 6;
        int total = 0;
        for(int i = 1; i<number; i++){
            if(number%i==0){
                total += i;

            }
        }

        if (total == number){
            System.out.println("Mukemmel sayi");
        }else{
            System.out.println("Mukemmel sayi degildir ");
        }



    }
}