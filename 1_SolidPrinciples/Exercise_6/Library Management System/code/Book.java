public class Book implements Comparable<Book> {
    int bookId;
    String title;
    String author;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title.toLowerCase(); // normalizing for search
        this.author = author;
    }

    @Override
    public String toString() {
        return bookId + " - " + title + " by " + author;
    }

    @Override
    public int compareTo(Book other) {
        return this.title.compareTo(other.title);
    }
}
