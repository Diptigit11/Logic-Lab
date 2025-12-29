package Day4;

public class LibraryBook {

    // encapsulated fields
    private String title;
    private String author;
    private boolean issued;

    // static catalog count
    public static int totalBooks = 0;

    // constructor
    public LibraryBook(String title, String author) {
        this.title = title;
        this.author = author;
        this.issued = false;   // initially not issued
        totalBooks++;          // count this book
    }

    // issue book only if not already issued
    public void issue() {
        if (!issued) {
            issued = true;
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Book already issued. Cannot issue again.");
        }
    }

    // return book only if currently issued
    public void returnBook() {
        if (issued) {
            issued = false;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book was not issued. Cannot return.");
        }
    }

    // check issue status
    public boolean isIssued() {
        return issued;
    }
    public static void main(String[] args) {

        LibraryBook b = new LibraryBook("1984", "Orwell");
        LibraryBook bm = new LibraryBook("1988", "Dipti");

        b.issue();       // true path
        b.issue();       // rejected
        b.returnBook();  // true path

        System.out.println(b.isIssued());        // false
        System.out.println(LibraryBook.totalBooks); // 1
    }
}
