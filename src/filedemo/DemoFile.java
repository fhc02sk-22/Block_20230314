package filedemo;

import java.io.File;

public class DemoFile {
    public static void main(String[] args) {
        // D:\temp\ETS23\sub-ordner\bilder
        File f = new File("D:\\temp\\ETS23\\sub-ordner\\");
        //File f = new File("..\\");

        System.out.println("f.getAbsolutePath() = " + f.getAbsolutePath());
        
        System.out.println("f.isFile() = " + f.isFile());
        System.out.println("f.isDirectory() = " + f.isDirectory());
        System.out.println("f.length() = " + f.length());

        /*for (File files : f.listFiles()) {
            System.out.println(files.getName());
        }*/

        System.out.println("printAndGetSize(f) = " + printAndGetSize(f));
    }

    public static long printAndGetSize(File f) {

        if (f.exists() == false)
            return 0;

        if (f.isFile()) { 
            // Es handelt sich nur um eine Datei, daher ausgeben + fertig
            System.out.println(f.getName() + " " + f.length());
            return f.length();
        }
        
        // Es handelt sich um einen Ordner, alle durchlaufen
        long result = 0;
        for (File files : f.listFiles()){
            System.out.println(files.getName() + " " + files.length());
            result += files.length();

            if (files.isDirectory()) {
                result += printAndGetSize(files);
            }
        }

        return result;
    }
}
