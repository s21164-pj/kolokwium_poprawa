import java.util.ArrayList;
import java.util.List;

public class Shop {
    private int shopId;
    private String shopName;

    List<Product> ownedProduct = new ArrayList<>();
    List<Product> soldProducts = new ArrayList<>();

    public Shop(int shopId, String shopName, List<Product> ownedProduct) {
        this.shopId = shopId;
        this.shopName = shopName;
        this.ownedProduct = ownedProduct;
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
}
