package HW3.Task2;

public class Trumpet implements Instrument{

    private String name;
    private double diameter;

    public Trumpet() {

    }
    public Trumpet(String name, double diameter) {
        this.name = name;
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Now plays " + name + " with diameter " + diameter + "\";");
    }
}
