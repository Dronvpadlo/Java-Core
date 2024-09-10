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

    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        if (displaySize>0) {
            this.displaySize = displaySize;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Display Size: " + displaySize + "\"" +
                ", Keyboard Lighting: " + keyboardLighting;
    }
}
