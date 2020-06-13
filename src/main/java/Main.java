import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        Product bulka = new Product(1, 2, "bulka");
        Shop shop = new Shop(1, "SklepOli");



        Set<ConstraintViolation<Product>> violations = validator.validate(bulka);

        for (ConstraintViolation<Product> violation : violations) {
            System.out.println(violations);
        }
        Set<ConstraintViolation<Shop>> violations2 = validator.validate(shop);

        for (ConstraintViolation<Shop> violation : violations2) {
            System.out.println(violations2);
        }
    }
}

