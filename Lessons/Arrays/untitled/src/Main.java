import java.lang.module.ModuleReference;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String student1 = "Ataberk";
        String student2 = "Okay";
        String student3 = "Ilayda";
        String student4 = "Mert";

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println("--------------------------");

        String[] students;
        students = new String[4];

        students[0]=student1;
        students[1]=student2;
        students[2]=student3;
        students[3]=student4;

        for(int i = 0; students.length > i; i++){
            System.out.println(students[i]);
        }
        System.out.println("--------------------------");

        for(String student:students){
            System.out.println(student);
        }

        System.out.println("--------------------------");


        double[] myList = {1.2,1.3,1.4,1.5,1.6};
        double total = 0;
        for(double number:myList){
            total += number;
            System.out.println(number);
        }
        System.out.println("Toplam = "+total);





        // COK BOYUTLU DIZILERLE CALISMAK

        String[][] Cities;
        Cities = new String[3][3];
        Cities[0][0] = "Izmir";
        Cities[0][1] = "Denizli";
        Cities[0][2] = "Manisa";
        Cities[1][0] = "Istanbul";
        Cities[1][1] = "Bursa";
        Cities[1][2] = "Yalova";
        Cities[2][0] = "Diyarbakir";
        Cities[2][1] = "Sanliurfa";
        Cities[2][2] = "Kahramanmaras";
        for(int i = 0; i<=2; i++){
            System.out.println("-------------------------------");
            for(int k = 0;k<=2;k++){
                System.out.println(Cities[i][k]);
            }
        }

    }
}