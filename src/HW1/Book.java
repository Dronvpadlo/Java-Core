package HW1;

public class Book {
    private String title;
    private int pages;
    private String author;
    private String genre;

    public Book(String title, int pages, String author, String genre){
        this.title = title;
        this.pages = pages;
        this.author = author;
        this.genre = genre;
    }

    public String toString(){
        return "{Title: " + title +
                ", Pages: " + pages +
                ", Author: " + author +
                ", Genre: " + genre + "}";
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if (pages>0) {
            this.pages = pages;
        }
    }

    public String getAuthors() {
        return author;
    }

    public void setAuthors(String authors) {
        author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
