public class Product {
    //attribute || field
    //Private tanimlamamizin sadece icerisinde bulundugu suslu parantezler arasinda calismasi gerektigini belirtirir. Eger biz bunu bir if blogu icerisinde tanimlasaydik sadece o if blogu icerisinde kullanalabilirdik.
    // This tanimi benim icerisinde bulundugum class i belirtir.
    private int _id;
    private String _name;
    private String _discription;
    private double _price;
    private int _stockAmount;
    private String _UrunKodu;

    //getter
    public int getId(){
        return _id;
    }
    public String getName(){
        return _name;
    }
    public String getDiscription(){
        return _discription;
    }
    public double getPrice(){
        return _price;
    }
    public int getStockAmount(){
        return _stockAmount;
    }
    public String getUrunKodu(){
        return this._name.substring(0,2)+"_"+_id;
    }
    public String getAll(){
        return _name + '\n' +  _discription + '\n' + _price + '\n' + _stockAmount + '\n' + _UrunKodu;
    }

    //setter
    public void setId(int MyId){
        this._id = MyId;
    }
    public void setName(String name) {
        _name = name;
    }
    public void setDiscription(String discription){
        _discription=discription;
    }
    public void setPrice(double price){
        _price = price;
    }
    public void setStockAmount(int stockAmount){
        _stockAmount = stockAmount;
    }
    public void setUrunKodu(String urunkodu){
        _UrunKodu = urunkodu;
    }


}
