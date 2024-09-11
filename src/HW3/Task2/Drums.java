package HW3.Task2;

public class Drums implements Instrument{

    private String name;
    private double size;
    public Drums(){

    }

    public Drums(String name, double size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Now plays " + name + " with size " + size + " cm;");
    }
}
