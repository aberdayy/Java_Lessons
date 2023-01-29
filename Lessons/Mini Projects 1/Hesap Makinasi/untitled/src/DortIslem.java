public class DortIslem{
    public double Topla(double sayi1, double sayi2){
        return sayi1 + sayi2;
    }

    public double Cikar(double sayi1, double sayi2){
        return sayi1 - sayi2;
    }
    public double Carp(double sayi1, double sayi2){
        return sayi1*sayi2;
    }
    public double bol(double sayi1, double sayi2) {
        if ((sayi1 != 0) || (sayi2 != 0)) {
            double result = sayi1 / sayi2;
            return result;
        }else{
            return 0;
        }
    }
}
