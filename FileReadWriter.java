import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.File;

public class FileReadWriter {
    public static void main(String[] args) {
        // Write
        try {
            File file = new File("index.html");
            FileWriter file2 = new FileWriter("FileReadWriter.txt");
            file2.write("Hello From Nischal!");
            file2.close();
            System.out.println("Write File Success");
        } catch (Exception e) {
            System.out.println(e);
        }

        // Read
        try {
            FileReader file = new FileReader("FileReadWriter.txt");
            BufferedReader br = new BufferedReader(file);
            String content = br.readLine();
            System.out.println("Reading From File...");
            System.out.println("Content:");
            System.out.println(content);
            file.close();
            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
