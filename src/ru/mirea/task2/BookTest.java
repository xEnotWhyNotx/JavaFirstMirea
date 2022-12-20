package ru.mirea.task2;

public class BookTest {
    public static void main(String[] args) {
        var book = new Book();
        book.setAuthor("Linus Torvalds");
        book.setName("Just for fun");
        book.setCoverType("Soft");
        book.setEditionYear(2002);
        book.setPageCount(288);
        System.out.println(book.getAuthor());
        System.out.println(book.getName());
        System.out.println(book.getCoverType());
        System.out.println(book.getEditionYear());
        System.out.println(book.getPageCount());

    }
}
