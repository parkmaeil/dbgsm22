package com.example.webapp.entity;
// 설계(모델링) => 잘?
public class Book {
    private int book_id;
    private String title;
    private String publisher;
    private String author;
    private int price;
    private String isbn;
    private String pub_date;
    public Book() {
    }
    public Book(int book_id, String title, String publisher, String author, int price, String isbn, String pub_date) {
        this.book_id = book_id;
        this.title = title;
        this.publisher = publisher;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
        this.pub_date = pub_date;
    }
    public Book(String title, String publisher, String author, int price, String isbn) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPub_date() {
        return pub_date;
    }

    public void setPub_date(String pub_date) {
        this.pub_date = pub_date;
    }

    @Override
    public String toString() {
        return "Book{" +
                "book_id=" + book_id +
                ", title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", isbn='" + isbn + '\'' +
                ", pub_date='" + pub_date + '\'' +
                '}';
    }
}
