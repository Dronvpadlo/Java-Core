package HW3.Task2;

public class Guitar implements Instrument {
    private String name;
    private int numberOfStrings;
    public Guitar(){

    }

    public Guitar(String name, int numberOfStrings) {
        this.name = name;
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public void play() {
        System.out.println("Now plays " + name + " with " + numberOfStrings + " numbers of strings;");
    }
}
