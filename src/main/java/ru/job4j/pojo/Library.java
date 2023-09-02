package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book abc = new Book("Abc", 40);
        Book bible = new Book("Bible", 1272);
        Book constitution = new Book("Constitution", 67);
        Book cleanCode = new Book("Clean Code", 459);
        Book[] books = new Book[4];
        books[0] = abc;
        books[1] = bible;
        books[2] = constitution;
        books[3] = cleanCode;
        for (Book book : books) {
            System.out.println(book.getName() + " - " + book.getPage());
        }
        System.out.println("Replace 0 to 3 ");
        books[0] = constitution;
        books[2] = abc;
        for (Book book : books) {
            System.out.println(book.getName() + " - " + book.getPage());
        }
        for (Book book : books) {
            if (book.getName().equals("Clean Code")) {
                System.out.println(book.getName());
            }
        }
    }
}
