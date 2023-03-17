package fileoutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoFileOutput {
    public static void main(String[] args) {

        File f = new File("D:\\temp\\ETS23\\sub-ordner\\dokumente\\demo20230717.campus02");

        try {
            FileOutputStream fos = new FileOutputStream(f);

            String demo = "Wir haben die Intensivwoche um 21:30 hinter uns :-)!";
            char[] arrayOfChars = demo.toCharArray();
            for (char c : arrayOfChars) {
                fos.write((int) c);

            }
            fos.flush();
            fos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
