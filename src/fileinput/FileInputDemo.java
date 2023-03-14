package fileinput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputDemo {
    public static void main(String[] args) throws IOException {

        File file = new File("D:\\temp\\ETS23\\sub-ordner\\dokumente\\demo.txt");
        // if-Abfrage

        FileInputStream fis = new FileInputStream(file);
        int byteRead;
        while ((byteRead = fis.read()) != -1) {

            //char[] chars = Character.toChars(byteRead);
            //System.out.println("chars[0] = " + chars[0]);
            System.out.println((char) byteRead);
        }
        fis.close();


    }
}
