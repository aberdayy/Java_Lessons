public class Main {
    public static void main(String[] args) {
        try
        {
            int[] sayilar = new int[]{1, 2, 3};
            System.out.println(sayilar[5]);

        } catch (Exception exception){
            System.out.println("Hata Olustu! Gelen hata =>  " + exception);
        }finally {
            System.out.println("Ben her turlu calisirim");
        }

        System.out.println("Bu kod blogu hata yonetimi sayesinde calismaya devam eder");

    }
}