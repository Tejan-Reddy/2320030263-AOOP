public class Main {
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog();

        catalog.addProduct(new Product("Laptop", 999.99));
        catalog.addProduct(new Product("Smartphone", 499.99));
        catalog.addProduct(new Product("Tablet", 299.99));

        System.out.println("Products sorted by name:");
        catalog.sortProducts();
        for (Product product : catalog) {
            System.out.println(product);
        }

        System.out.println("\nProducts sorted by price:");
        catalog.sortProductsByPrice();
        for (Product product : catalog) {
            System.out.println(product);
        }

        // Cloning a product
        try {
            Product clonedProduct = (Product) catalog.getProduct(0).clone();
            System.out.println("\nCloned Product: " + clonedProduct);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
