package HW3;

public class Magazine implements Printable{
    private final String author;
    private final String title;
    private final int pages;
    private final String month;
    private final boolean glossy;

    public Magazine(String author, String title, int pages, String month, boolean glossy) {
        this.author = author;
        this.title = title;
        this.pages = pages;
        this.month = month;
        this.glossy = glossy;
    }

    public void print(){
        System.out.println("Book: {" + title + ", Author: " + author + ", Pages: " + pages + ", Month: " + month + ", Grossy: " + glossy + "}");
    }
}
