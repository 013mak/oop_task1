package Seminars.Seminar1;
import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    protected List<Product> products = new ArrayList<Product>();

    public VendingMachine() {
        this.products = new ArrayList<>();
    }

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public void addProducts (List<Product> products) {
        this.products.addAll(products);
    }

    public Product getProduct (String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                Product result = product;
                products.remove(product);
                return result;
            }
        }
        System.out.println("No product with name " + name + " found");
        return null;
    }

    public Product getProduct (String name, int temp, int volume) {
        for (Product product : products) {
            if (product.getName().equals(name) && product.getTemperature()==temp && product.getVolume()==volume) {
                Product result = product;
                products.remove(product);
                return result;
            }
        }
        System.out.println("No product with name " + name + " found");
        return null;
    }



    public List<Product> getProducts() {
        return products;
    }
}
