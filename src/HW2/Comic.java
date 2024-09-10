package HW2;

public class Comic extends Book{
    private String illustrator;

    public Comic(){

    }
    public Comic(String materials, String title, String author, int pages, String illustrator) {
        super(materials, title, author, pages);
        this.illustrator = illustrator;
    }

    public String getIllustrator() {
        return illustrator;
    }

    public void setIllustrator(String illustrator) {
        this.illustrator = illustrator;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Illustrator: " + illustrator +
                '}';
    }
}
