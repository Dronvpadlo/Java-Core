package HW2.Task3;

public class Magazine extends Book{
    private int number;

    public Magazine(){

    }
    public Magazine(String materials, String title, String author, int pages, int number) {
        super(materials, title, author, pages);
        this.number = number;
    }
    @Override
    public String toString() {
        return super.toString() +
                ", Number: " + number +
                '}';
    }
}

