package fileinconsole;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoFileInConsole {
    public static void main(String[] args) {

        File f = new File("D:\\temp\\ETS23\\sub-ordner\\dokumente\\from_console.txt");

        int byteRead;
        try (FileOutputStream fos = new FileOutputStream(f)) {

            while ((byteRead = System.in.read()) != 'x') {
                fos.write(byteRead);
            }
            fos.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
