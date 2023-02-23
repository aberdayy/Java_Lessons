public class Main {
    public static void main(String[] args) {

        ProductManager manager = new ProductManager();
        Product product = new Product();

        product.id = 1;
        product.name= "Laptop";
        product.price=2800;

        manager.add(product);



        /*
        //bu kullanim sekili onerilmez. Single responsibility prensibine aykiri bir kullanimdir.
        //bahsi gecen prensip databaseHelperCrud ve databaseHelperCreateConnection seklinde iki adet class kullanimlasini onerir.
        DatabaseHelper.Connection.createConnection();
        DatabaseHelper.CRUD.Update();
         */
    }

}