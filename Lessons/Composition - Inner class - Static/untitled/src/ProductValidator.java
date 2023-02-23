public class ProductValidator {
    // Ana class static olamaz.
    static {
        //Static constructor yapisinda ise newleme islemine gerek kalmadan static yapici blok calisir.
        //bir den fazla static blok yazilabilir
        System.out.println("Static Yapici blok calisti");
    }
    public ProductValidator(){
        // Bu kullanim seklinde productManager classinda newlenme islemi yapilmadigi taktirde constructor blogumuz calismaz.
        System.out.println("Yapici blok calisti");
    }
    public static boolean isValid(Product product){
        if (product.price>0 && !product.name.isEmpty()){
            return true;
        }else{
            return false;
        }

    }

    public static class BaskaBirClass{
        //Bu kullanim inner class seklinde gecer
        public static void Sil(){

        }
    }

}
