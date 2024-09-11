package HW3;

public class Book implements Printable{

    private final String author;
    private final String title;
    private final int pages;

    public Book(String author, String title, int pages) {
        this.author = author;
        this.title = title;
        this.pages = pages;
    }

    public void print(){
        System.out.println("Book: {" + title + ", Author: " + author + ", Pages: " + pages + "}");
    }
}
