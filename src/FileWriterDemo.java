import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriterDemo {

    public static void main(String[] args) {

        try (FileWriter fw = new FileWriter(
                "D:\\temp\\ETS23\\sub-ordner\\dokumente\\textfile.txt", true);
             PrintWriter pw = new PrintWriter(fw)
            ) {
            pw.println("Zeile 1");
            pw.println("Zeile 2");
            pw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
