public class Book {
    private String nameBook;
    private Author authorBook;
    private int jearBook;

    public Book(String nameBook, Author authorBook, int jearBook) {
        this.nameBook = nameBook;
        this.authorBook = authorBook;
        this.jearBook = jearBook;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public Author getAuthorBook() {
        return this.authorBook;
    }

    public int getJearBook() {
        return this.jearBook;
    }

    public void setJearBook(int jearBook) {
        this.jearBook = jearBook;
    }

    @Override
    public String toString() {
        return "Название книги: " + this.nameBook + " Автор: " + this.authorBook + " Год: " + this.jearBook;
    }

    @Override
    public boolean equals(Object b) {
        if (this.getClass() != b.getClass()) {
            return false;
        }
        Book book = (Book) b;
        return nameBook.equals(book.nameBook);

    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(nameBook);
    }

}
