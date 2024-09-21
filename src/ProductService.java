import java.util.ArrayList;
import java.util.List;

public class ProductService {

    List<Product> product = new ArrayList<>();
    public void addProduct(Product p){
        product.add(p);
    }

    public List<Product> getAllProducts() {
        return product;
    }

    public Product getProduct(String name){
        for(Product p:product){
            if(p.getName().equals(name))
                return p;
        }
        return null;
    }

    public List<Product> getProductwithText(String text) {
        String str = text.toLowerCase();
        List<Product> prods = new ArrayList<>();
        for (Product p : product) {
            String name = p.getName().toLowerCase();
            String type = p.getType().toLowerCase();
            String place = p.getPlace().toLowerCase();
            if (name.contains(str) || type.contains(str) || place.contains(str)) {
                prods.add(p);
            }
        }

        return prods;
    }
}

