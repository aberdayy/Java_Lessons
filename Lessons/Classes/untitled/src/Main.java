public class Main {
    public static void main(String[] args) {
        // classlar referans tiptir.
        // bellekte iki alan var stack ve heap
        CustomerManager customer_manager = new CustomerManager();
        customer_manager.Add();
        customer_manager.Delete();
        customer_manager.Update();


        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1=30;
        System.out.println(sayi2);

        int[] sayilar1 ={1,2,3};
        int[] sayilar2 = {4,5,6};
        sayilar2 = sayilar1;
        sayilar1[0] = 10;
        System.out.println(sayilar2[0]); // stack and heap yapisi


    }
}

