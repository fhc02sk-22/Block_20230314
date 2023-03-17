package productsdemo;

import java.io.*;
import java.util.ArrayList;

public class ProductManager {
    private ArrayList<Product> products = new ArrayList<>();

    public void add(Product p) {
        products.add(p);
    }

    public void save(String path) {

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(path))){

            for (Product p : products) {
                oos.writeObject(p);
            }
            oos.writeObject(null);
            oos.flush();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void load(String path) {

        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(path))){

            Object readObject;

            while ((readObject = ois.readObject()) != null){
                Product p = (Product) readObject;
                add(p);
            }

        } catch(EOFException eof) {
           // System.out.println("Ende erreicht - juhu!!! alles gelesen!!!");
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void print(){
        System.out.println("products = " + products);
    }
}
