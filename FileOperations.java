import java.io.*;
public class FileOperations {
    public static void main(String[] args) throws IOException {

        File file = new File("sample.txt");

        if (file.createNewFile()) {
            System.out.println("File created successfully.");
        } else {
            System.out.println("File already exists.");
        }

        FileWriter writer = new FileWriter(file);
        writer.write("Hello! This is a Java file operation program.");
        writer.close();
        System.out.println("Data written successfully.");

        FileReader reader = new FileReader(file);
        int ch;

        System.out.println("File contents:");
        while ((ch = reader.read()) != -1) {
            System.out.print((char) ch);
        }
        reader.close();

    
        if (file.delete()) {
            System.out.println("\nFile deleted successfully.");
        } else {
            System.out.println("\nFile could not be deleted.");
        }
    }
}
