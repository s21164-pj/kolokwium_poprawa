import javax.print.attribute.standard.Finishings;
import javax.validation.constraints.Null;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ShopService {
    private Shop shop;

    public ShopService(Shop shop) {
        this.shop = shop;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    private Optional<Product> findProductInShop(String productId) {
        Product product = shop.getOwnedProduct().stream().filter(player -> player.getProductId().contains(productId))
                .findFirst().orElse(null);

        return Optional.ofNullable(product);
    }

    private Optional<Product> findProductInCustomer(String productId, Customer customer) {
        Product product = customer.getPurchasedProducts().stream().filter(player -> player.getProductId().contains(productId))
                .findFirst().orElse(null);

        return Optional.ofNullable(product);
    }

//    public List<Product> sellProduct(int productId, Customer customer){
//
//
//    }
//
//    public List<Product> returnProduct(int productId, Customer customer) {
//
//    }

}
