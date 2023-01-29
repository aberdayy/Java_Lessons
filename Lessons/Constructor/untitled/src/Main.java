public class Main {
    public static void main(String[] args) {
        Product product = new Product(2,"MSI Ge66 Raider", "MSI GE66 Gaming Laptop",2299,255,"22M");

        product.setId(1);
        product.setName("MSI GE66");
        product.setDiscription("The best laptop you can buy right now");
        product.setPrice(2299.80);
        product.setStockAmount(23);
        product.setUrunKodu(product.getUrunKodu());
        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        //productManager.Add2(1, "ata", "aciklama", 24, 200); DOGRU BIR KULLANIM DEGIL

    }
}