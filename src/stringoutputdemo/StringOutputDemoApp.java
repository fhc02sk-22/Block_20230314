package stringoutputdemo;

import java.io.*;

public class StringOutputDemoApp {
    public static void main(String[] args) {

        File f = new File("D:\\temp\\ETS23\\sub-ordner\\dokumente\\stringoutput.txt");

        try (FileOutputStream fos = new FileOutputStream(f);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            String helloWorld = "Hello World";

            oos.writeObject(helloWorld);
            oos.flush();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
