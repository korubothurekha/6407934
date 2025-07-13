import java.util.*;

class Order {
    int orderId;
    String customerName;
    double totalPrice;

    public Order(int orderId, String customerName, double totalPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        

        return orderId + " - " + customerName + ": Rs." + totalPrice;
    }
}

public class SortOrders {

    // Below is the Bubble Sort algorithm implementation and its time complexity
    // isO(n^2)
    public static void bubbleSort(Order[] orders) {
        int n = orders.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (orders[j].totalPrice > orders[j + 1].totalPrice) {
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break; // added for optimizing the time complexity
        }
    }

    // Below is the Quick Sort algorithm implementation and its average case time
    // complexity is O(n log n) and worst case time complexity O(n^2)
    public static void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            int pi = partition(orders, low, high);
            quickSort(orders, low, pi - 1);
            quickSort(orders, pi + 1, high);
        }
    }

    private static int partition(Order[] orders, int low, int high) {
        double pivot = orders[high].totalPrice;
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (orders[j].totalPrice <= pivot) {
                i++;
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }
        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;
        return i + 1;
    }

    public static void printOrders(Order[] orders, String label) {
        System.out.println(label);
        for (Order o : orders) {
            System.out.println(o);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Order[] orders1 = {
                new Order(101, "Rekha", 4500.0),
                new Order(102, "Aman", 1900.0),
                new Order(103, "Priya", 7500.0),
                new Order(104, "Yash", 3200.0),
                new Order(105, "Riya", 2100.0)
        };

        Order[] orders2 = Arrays.copyOf(orders1, orders1.length);

        bubbleSort(orders1);
        printOrders(orders1, "Bubble Sorted Orders (by Total Price):");

        quickSort(orders2, 0, orders2.length - 1);
        printOrders(orders2, "Quick Sorted Orders (by Total Price):");
    }
}
