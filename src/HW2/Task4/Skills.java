package HW2.Task4;

public class Skills {
    private String title;
    private int exp;
    public Skills(){

    }
    public Skills(String title, int exp) {
        this.title = title;
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "Skills{" +
                "title='" + title + '\'' +
                ", exp=" + exp +
                '}';
    }
}
