import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Product {
    private String productId;

    @NotNull(message = "Price cannot be null")
    private int price;

    private String name;

    public Product(String productId, @NotNull(message = "Price cannot be null") int price, @Size(min = 6, message = "Min 6 letters") @Pattern(regexp = "[a-zA-Z]+", message = "only letters") String name) {
        this.productId = productId;
        this.price = price;
        this.name = name;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}



