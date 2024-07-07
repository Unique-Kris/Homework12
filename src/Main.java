public class Main {
    public static void main(String[] args) {
        Author firstAuthor = new Author("Nikolai", "Prokhorenok");
        Author secondAuthor = new Author("Herbert", "Schildt");

        Book firstBook = new Book("Basics Java", firstAuthor, 2019);
        firstBook.setYearOfPublication(2022);
        Book secondBook = new Book("Java. The Complete Guide", secondAuthor, 2022);
        secondBook.setYearOfPublication(2023);
    }
}