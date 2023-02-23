public class ProductManager {
    //Manager classlari asla static olmamali sadece yardimci araclarda kullanilirsa saglikli olur obur turlu kullanilidigi taktirde bir kullanici ana classta bir veri degistirdiginde butun kullanicilarda o veri degisecektir.
    public void add(Product product){
        //Productvalidator cagirabilmemizin sebebi isValid in static yapida olmasidir. Eger static olmasaydi bu yapiyi cagiramazdik
        if (ProductValidator.isValid(product)){
            System.out.println("Eklendi");
        }else{
            System.out.println("Urun Bilgileri gecersizdir!");
        }

    }
}
