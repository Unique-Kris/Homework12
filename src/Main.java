public class Main {

    public static void main(String[] args) {
        Author firstAuthor = new Author("Nikolai", "Prokhorenok");
        Author secondAuthor = new Author("Herbert", "Schildt");
        System.out.println("firstAuthor = " + firstAuthor);
        System.out.println("secondAuthor = " + secondAuthor);

        Book firstBook = new Book("Basics Java", firstAuthor, 2019);
        firstBook.setYearOfPublication(2022);
        Book secondBook = new Book("Java. The Complete Guide", secondAuthor, 2022);
        secondBook.setYearOfPublication(2023);
        System.out.println("firstBook = " + firstBook);
        System.out.println("secondBook = " + secondBook);


    }
}