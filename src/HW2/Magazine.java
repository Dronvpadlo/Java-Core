package HW2;

public class Magazine extends Book{
    private int number;

    public Magazine(){

    }
    public Magazine(String materials, String title, String author, int pages, int number) {
        super(materials, title, author, pages);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Number: " + number +
                '}';
    }
}

