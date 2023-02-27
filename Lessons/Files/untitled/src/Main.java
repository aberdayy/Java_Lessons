import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        getFileInfo();
        readFile();
        writeFile();
        readFile();

    }
    public static void createFile(){

            File file = new File("C:\\Users\\atabe\\IdeaProjects\\Java_Lessons\\Lessons\\Files\\untitled\\files\\student.txt");

            try {
                if(file.createNewFile()){
                    System.out.println("Dosya olusturuldu");
                }else {
                    System.out.println("Dosya hali hazirda mevcut");
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
    }

    public static void getFileInfo(){
        File file = new File("C:\\Users\\atabe\\IdeaProjects\\Java_Lessons\\Lessons\\Files\\untitled\\files\\student.txt");
        if(file.exists()){
            System.out.println("Dosya adi : " +file.getName());
            System.out.println("Dosya yolu : " +file.getAbsolutePath());
            System.out.println("Dosya yazilabilir mi? : " +file.canWrite());
            System.out.println("Dosya okunabilir mi? : " +file.canRead());
            System.out.println("Dosya boyutu : " +file.length());

        }else {

        }
    }
    public static void readFile(){
        File file = new File("C:\\Users\\atabe\\IdeaProjects\\Java_Lessons\\Lessons\\Files\\untitled\\files\\student.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
    public static void writeFile(){
        try {
            BufferedWriter  writer = new BufferedWriter(new FileWriter("C:\\Users\\atabe\\IdeaProjects\\Java_Lessons\\Lessons\\Files\\untitled\\files\\student.txt",true)); //son parametre deafult hali ile false gelir true yapmazsak dosyadaki herseyi silip ustune yazar
            writer.newLine(); //yeni satir olusturup onda sonra ekleme yapar.
            writer.write("Mert");
            System.out.println("Dosyaya yazildi");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}