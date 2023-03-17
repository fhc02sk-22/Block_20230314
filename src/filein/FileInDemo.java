package filein;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInDemo {
    public static void main(String[] args) {

        File f = new File("D:\\temp\\ETS23\\sub-ordner\\dokumente\\lorem-ipsum.txt");

        if (!f.exists()){
            System.out.println("Datei existiert nicht ....");
            return;
        }

        long countCharacter = 0;
        try {
            FileInputStream fis = new FileInputStream(f);
            int byteRead;
            while ((byteRead = fis.read()) != -1){
                char[] c = Character.toChars(byteRead);
                System.out.print(c[0]);
                //System.out.print((char) byteRead);
                countCharacter++;
            }
           // fis.close();

            System.out.println();
            System.out.println("Anzahl der Zeichen: " + countCharacter);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Exit");

    }
}
