public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("yellamma_temple.jpg");
        Image image2 = new ProxyImage("charminar.jpg");

        // First time - lazy load
        image1.display();
        System.out.println();

        // Second time - uses cache
        image1.display();
        System.out.println();

        // Another image - lazy load again
        image2.display();
    }
}
