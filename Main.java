public class Main {
    public static void main(String[] args) {
        System.out.println("Классы");
        Author firstAuthor = new Author("Лев", " Толстой");
        Author secondAuthor = new Author("Федор", " Достаевский");

        Book firstBook = new Book("Война и мир", firstAuthor, 1862);
        Book secondBook = new Book("Белый ночи", secondAuthor, 1848);
        System.out.println(firstBook);
        System.out.println(secondBook);
        secondBook.setJearBook(1849);
        System.out.println(secondBook);
        System.out.println(firstAuthor.hashCode());
        System.out.println(secondAuthor.hashCode());
        System.out.println(firstBook.hashCode());
        System.out.println(secondBook.hashCode());
        System.out.println(firstBook.equals(secondBook));
        System.out.println(firstAuthor.equals(secondAuthor));
    }
}