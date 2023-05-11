public class Author {
    private String nameAuthor;
    private String surNameAuthor;

    public Author(String nameAuthor, String surNameAuthor) {
        this.nameAuthor = nameAuthor;
        this.surNameAuthor = surNameAuthor;
    }

    public String getSurNameAuthor() {

        return this.surNameAuthor;
    }

    public String getNameAuthor() {
        return this.nameAuthor;
    }

    @Override
    public String toString() {
        return this.nameAuthor + " " + this.surNameAuthor;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(nameAuthor);
    }

    @Override
    public boolean equals(Object b) {
        if (this.getClass() != b.getClass()) {
            return false;
        }
        Author author = (Author) b;
        return nameAuthor.equals(author.nameAuthor);
    }
}
