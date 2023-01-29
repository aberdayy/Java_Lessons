public class Main {
    public static void main(String[] args) {
        SayiBul(9);
    }

    public static void SayiBul(int aranacak){
        int[] sayilar = new int[]{1,2,3,4,56,9,0};

        boolean varMi = false;
        for(int i : sayilar){
            if(i == aranacak){
                varMi = true;
                break;
            }
        }
        if(varMi){
            System.out.println("Sayi mevcut");
        }else{
            System.out.println("Sayi mevcut degil");
        }

    }

}