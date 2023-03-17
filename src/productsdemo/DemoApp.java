package productsdemo;

public class DemoApp {
    public static void main(String[] args) {

        ProductManager pm = new ProductManager();
       // pm.add(new Product("Samsung LCD 27", 299.0, "Display"));
      //  pm.add(new Product("HP Laptop 15 Zoll", 1200.0, "Laptop"));

       // pm.save("D:\\temp\\ETS23\\sub-ordner\\dokumente\\products.dat");


        pm.load("D:\\temp\\ETS23\\sub-ordner\\dokumente\\products.dat");
        pm.print();

    }
}
