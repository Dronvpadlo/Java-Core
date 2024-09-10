package HW2.Task2;

public class Laptop extends PC {

    private double displaySize;
    private boolean keyboardLighting;
    public Laptop(){

    }

    public Laptop(String pcName, String processorName, double frequency, int ram, double displaySize, boolean keyboardLighting) {
        super(pcName, processorName, frequency, ram);
        this.displaySize = displaySize;
        this.keyboardLighting = keyboardLighting;
    }

    @Override
    public String toString() {
        return super.toString() + ", Display Size: " + displaySize + "\"" +
                ", Keyboard Lighting: " + keyboardLighting;
    }
}
