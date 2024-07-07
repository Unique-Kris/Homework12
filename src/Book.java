import java.util.Objects;

public class Book {
    private String nameBook;
    private Author author;
    private int yearOfPublication;

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", author=" + author +
                ", yearOfPublication=" + yearOfPublication +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication && Objects.equals(nameBook, book.nameBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, author, yearOfPublication);
    }

    public Book(String nameBook, Author author, int yearOfPublication) {
        this.nameBook = nameBook;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public Author getNameAuthor() {
        return this.author;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int year) {
        this.yearOfPublication = year;
    }
}
