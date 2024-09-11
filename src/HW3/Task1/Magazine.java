package HW3.Task1;

public class Magazine implements Printable {
    private String author;
    private String title;
    private int pages;
    private String month;
    private boolean glossy;

    public Magazine(){

    }

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
