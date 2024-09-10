package HW2.Task3;

public class Book extends Papirus{
    private String title;
    private String author;
    private int pages;
    public Book(){

    }
    public Book(String materials, String title, String author, int pages) {
        super(materials);
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    @Override
    public String toString() {
        return title + ": {" +
                "Title: " + title +
                ", Author: " + author +
                ", Pages: " + pages;
    }
}
