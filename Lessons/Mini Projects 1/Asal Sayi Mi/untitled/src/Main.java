import static javax.management.Query.and;

public class Main {
    public static void main(String[] args) {
        for(int i = 0; i<=100;i++){
            int remainder = i%2;
            if((remainder!=0)&&(i % 3 != 0)){
                System.out.println("Bu bir Asal sayidir => " +i);
            }
        }
    }
}