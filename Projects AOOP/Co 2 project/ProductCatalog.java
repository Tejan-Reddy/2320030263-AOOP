import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ProductCatalog implements Iterable<Product> {
    private List<Product> products;

    public ProductCatalog() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void sortProducts() {
        Collections.sort(products); // Sort by natural ordering (name)
    }

    public void sortProductsByPrice() {
        products.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice())); // Sort by price
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }

    public Product getProduct(int index) {
        return products.get(index);
    }

    public int size() {
        return products.size();
    }
}
