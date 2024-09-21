import java.util.List;

public class Main {
    public static void main(String[] args) {

      //  Product p = new Product("Asus","Laptop","Delhi",2);
       ProductService service = new ProductService();
       service.addProduct(new Product("Asus","Laptop","Delhi",2));
        service.addProduct(new Product("Asus", "Laptop", "Delhi", 2));
        service.addProduct(new Product("Apple", "Smartphone", "Mumbai", 5));
        service.addProduct(new Product("Samsung", "Television", "Bangalore", 10));
        service.addProduct(new Product("Sony", "Camera", "Chennai", 4));
        service.addProduct(new Product("HP", "Laptop", "Hyderabad", 3));
        service.addProduct(new Product("Dell", "Desktop", "Pune", 7));
        service.addProduct(new Product("Lenovo", "Laptop", "Kolkata", 6));
        service.addProduct(new Product("OnePlus", "Smartphone", "Delhi", 8));
        service.addProduct(new Product("LG", "Washing Machine", "Chennai", 2));
        service.addProduct(new Product("Panasonic", "Refrigerator", "Mumbai", 1));
        service.addProduct(new Product("Nokia", "Smartphone", "Hyderabad", 3));
        service.addProduct(new Product("Xiaomi", "Smartwatch", "Pune", 9));
        service.addProduct(new Product("Acer", "Laptop", "Bangalore", 4));
        service.addProduct(new Product("Toshiba", "Television", "Delhi", 5));

        List<Product> products = service.getAllProducts();
        //Using enhanced for loop to print all products in seperate lines
//        for(Product p:products){
//            System.out.println(p);
//        }
//        System.out.println("a particular product!!");
//        Product p = service.getProduct("Acer");
//        System.out.println(p);

       List<Product>prods =  service.getProductwithText("Laptop");

       for(Product p:prods){
           System.out.println(p);
       }
    }
}