import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {

        try (BufferedReader bf = new BufferedReader(
                new FileReader("D:\\temp\\ETS23\\sub-ordner\\dokumente\\er hörte leise.txt")))
        {
            String line;
            while ((line = bf.readLine()) != null){
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
