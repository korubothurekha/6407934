import java.util.Arrays;
import java.util.Scanner;

public class LibraryManager {

    public static void main(String[] args) {
        Book[] books = {
            new Book(101, "Data Structures", "Yashwant Kanetkar"),
            new Book(102, "Operating Systems", "Galvin"),
            new Book(103, "Java Programming", "E. Balagurusamy"),
            new Book(104, "Database Systems", "Raghu Ramakrishnan"),
            new Book(105, "Computer Networks", "Tanenbaum")
        };

        Scanner sc = new Scanner(System.in);

        // Linear Search
        System.out.print("Enter book title to search (Through Linear Search): ");
        String title = sc.nextLine();
        Book result1 = linearSearch(books, title);
        System.out.println(result1 != null ? "Found: " + result1 : "Book not found.");

        // Sort array before Binary Search
        Arrays.sort(books);

        // Binary Search
        System.out.print("\nEnter book title to search ( Through Binary Search): ");
        String title2 = sc.nextLine();
        Book result2 = binarySearch(books, title2);
        System.out.println(result2 != null ? "Found: " + result2 : "Book not found.");

        sc.close();
    }

    // Linear search by title
    public static Book linearSearch(Book[] books, String title) {
        title = title.toLowerCase();
        for (Book book : books) {
            if (book.title.equals(title)) {
                return book;
            }
        }
        return null;
    }

    // Binary search by title
    public static Book binarySearch(Book[] books, String title) {
        title = title.toLowerCase();
        int left = 0, right = books.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = books[mid].title.compareTo(title);

            if (cmp == 0) return books[mid];
            else if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }

        return null;
    }
}
