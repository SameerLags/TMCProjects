import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<Book>();
    }

    public void addBook(Book newBook) {
        this.books.add(newBook);
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> booksFound = new ArrayList<Book>();
        for (Book b:this.books) {
            if (StringUtils.included(b.title(), title)) {
                booksFound.add(b);
            }
        }
        return booksFound;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> booksFound = new ArrayList<Book>();
        for (Book b:this.books) {
            if (StringUtils.included(b.publisher(), publisher)) {
                booksFound.add(b);
            }
        }
        return booksFound;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> booksFound = new ArrayList<Book>();
        for (Book b:this.books) {
            if (b.year() == year) booksFound.add(b);
        }
        return booksFound;
    }

    public void printBooks() {
        for (Book b:this.books) {
            System.out.println(b);
        }
    }
}