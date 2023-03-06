package interfaces;

public class Library {
    public static void main(String[] args) {
        // product interface cannot be instantiated
        Product book = new Book();
        book.setName("The Song of Achilles");
        System.out.println(book.getName());
    }
}
