import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Product {
    private int productId;

    @NotNull(message = "Price cannot be null")
    private int price;

    @Size(min = 6, )
    private String name;



