package HW1;

public class Book {
    private String title;
    private int pages;
    private String Authors;
    private String genre;

    public Book(String title, int pages, String Authors, String genre){
        this.title = title;
        this.pages = pages;
        this.Authors = Authors;
        this.genre = genre;
    }

    public String toString(){
        return "{Title: " + title +
                ", Pages: " + pages +
                ", Author: " + Authors +
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
        return Authors;
    }

    public void setAuthors(String authors) {
        Authors = authors;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
