import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

public class Shop {
    private int shopId;

    @Size(min = 6, message = "Min 6 letters")
    @Pattern(regexp = "[a-zA-Z]+", message = "only letters")
    private String shopName;

    List<Product> ownedProduct = new ArrayList<>();
    List<Product> soldProducts = new ArrayList<>();


    public Shop(int shopId, @Size(min = 6, message = "Min 6 letters") @Pattern(regexp = "[a-zA-Z]+", message = "only letters") String shopName) {
        this.shopId = shopId;
        this.shopName = shopName;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Product> getOwnedProduct() {
        return ownedProduct;
    }

    public void setOwnedProduct(List<Product> ownedProduct) {
        this.ownedProduct = ownedProduct;
    }

    public List<Product> getSoldProducts() {
        return soldProducts;
    }

    public void setSoldProducts(List<Product> soldProducts) {
        this.soldProducts = soldProducts;
    }

    public  void addProduct(Product product) {
        this.ownedProduct.add(product);
    }

}
