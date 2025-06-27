
import java.util.*;

class Product {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    @Override
    public String toString() {
        return productId + " - " + productName + " (" + category + ")";
    }
}

public class ECommerceSearch {

    // linear search will take O(N) time complexity , where N is the No.of products
    // in the Products array
    public static Product linearSearch(Product[] products, int targetId) {
        for (Product p : products) {
            if (p.productId == targetId) {
                return p;
            }
        }
        return null;
    }

    // Binary Search takes O(log n) time complexity assuming that Products array is
    // sorted by productId
    public static Product binarySearch(Product[] products, int targetId) {
        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (products[mid].productId == targetId) {
                return products[mid];
            } else if (products[mid].productId < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(103, "T-Shirt", "Clothing"),
                new Product(105, "Shoes", "Footwear"),
                new Product(107, "Book", "Education"),
                new Product(109, "Watch", "Accessories")
        };

        // Linear Search
        int target = 105;
        Product result1 = linearSearch(products, target);
        System.out.println("Linear Search Result: " + (result1 != null ? result1 : "Not Found"));

        // Sorting array before applying Binary Search
        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));
        Product result2 = binarySearch(products, target);
        System.out.println("Binary Search Result: " + (result2 != null ? result2 : "Not Found"));
    }
}
