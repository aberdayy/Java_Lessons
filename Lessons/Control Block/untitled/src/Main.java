public class Main {
    public static void main(String[] args) {
        int sayi = 5;
        int sayi2= 7;
        if(sayi>sayi2) {
            System.out.println(sayi + " is bigger then " + sayi2);
        }else if(sayi==sayi2){
            System.out.println(sayi + " is equal to " + sayi2);
        }else{
            System.out.println( sayi2 + " is bigger then " + sayi);
        }


        char grade = 'A';

        switch (grade){
            case 'A':
                System.out.println("Mukemmel gectiniz");
                break;
            case 'B':
                System.out.println("Cok guzel gectiniz");
                break;
            case 'C':
                System.out.println("Iyi gectiniz");
                break;
        }
        char grade2 = 'B';
        switch (grade2) {
            case 'A' -> System.out.println("Mukemmel gectiniz");
            case 'B' -> System.out.println("Cok guzel gectiniz");
            case 'C' -> System.out.println("Iyi gectiniz");
        }

    }
}