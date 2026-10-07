import java.io.*;

class FileIO {
    public static void main(String[] args) {
        try {
            // Writing to file
            FileOutputStream out = new FileOutputStream("sample.txt");
            String data = "Hello Java I/O Stream!";
            out.write(data.getBytes());
            out.close();

            // Reading from file
            FileInputStream in = new FileInputStream("sample.txt");
            int ch;

            while ((ch = in.read()) != -1) {
                System.out.print((char) ch);
            }

            in.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
