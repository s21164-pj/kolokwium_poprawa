import java.util.ArrayList;
import java.util.List;

public class Customer {
   private String customerId;
   List<Product> purchasedProducts = new ArrayList<>();

    public Customer(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public List<Product> getPurchasedProducts() {
        return purchasedProducts;
    }

    public void setPurchasedProducts(List<Product> purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }

    public  void addProduct(Product product) {
        this.purchasedProducts.add(product);
    }
}
