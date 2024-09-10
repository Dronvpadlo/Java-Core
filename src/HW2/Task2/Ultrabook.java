package HW2.Task2;

import HW2.Task2.Laptop;

public class Ultrabook extends Laptop {
    private double weight;
    public Ultrabook(){

    }

    public Ultrabook(String pcName, String processorName, double frequency, int ram, double displaySize, boolean keyboardLighting, double weight) {
        super(pcName, processorName, frequency, ram, displaySize, keyboardLighting);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", weight=" + weight +
                "kg}";
    }
}
