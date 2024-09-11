package HW3.Task1;

public class Book implements Printable {

    private String author;
    private String title;
    private int pages;

    public Book(){

    }
    public Book(String author, String title, int pages) {
        this.author = author;
        this.title = title;
        this.pages = pages;
    }

    public void print(){
        System.out.println("Book: {" + title + ", Author: " + author + ", Pages: " + pages + "}");
    }
}
