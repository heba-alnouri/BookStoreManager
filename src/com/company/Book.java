package com.company;

public class Book {
    int bookId;
    String title;
    String genre;
    int price;
    int stocks;
    int sellings;
    Author author;
    Publisher publisher;

    public Book(int bookId, String title, String genre, int price, int stocks, int sellings, Author author, Publisher publisher) {
        this.bookId = bookId;
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.stocks = stocks;
        this.sellings = sellings;
        this.author = author;
        this.publisher = publisher;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getPrice() {
        return price;
    }

    public int getStocks() {
        return stocks;
    }

    public int getSellings() {
        return sellings;
    }

    public Author getAuthor() {
        return author;
    }

    public Publisher getPublisher() {
        return publisher;
    }
}
