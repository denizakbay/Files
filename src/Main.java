import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        creatFile();
//        getFileInfo();
        readFile();
        writeFile();
        readFile();

    }

    public static void creatFile() {

        File file = new File("C:\\Users\\Deniz\\IdeaProjects\\files\\students.txt");
        try {
            if (file.createNewFile())
                System.out.println("dosya oluşturuldu");
            else
                System.out.println("dosya zaten var");

        } catch (IOException e) {
            System.out.println("hata");
        }
    }

    public static void getFileInfo() {

        File file = new File("C:\\Users\\Deniz\\IdeaProjects\\files\\students.txt");

        if (file.exists()) {
            System.out.println("Dosya adı=" + file.getName());
            System.out.println("Dosya yolu=" + file.getAbsolutePath());
            System.out.println("Dosya yazılabilir mi=" + file.canWrite());
            System.out.println("Dosya okunabilir mi=" + file.canRead());
            System.out.println("Dosya boyutu(byte)=" + file.length());
        }

    }

    public static void readFile() {
        File file = new File("C:\\Users\\Deniz\\IdeaProjects\\files\\students.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
//                if(line.equals("bye")){
//                    System.out.println("bulundu = "+line);
                System.out.println(line);
//                }
            }

            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Deniz\\IdeaProjects\\files\\students.txt", true));//true ile üstüne yazmayı engeller ve ekleme yapar
            writer.newLine();
            writer.write("DENİZ");
            System.out.println("dosyaya yazıldı");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
