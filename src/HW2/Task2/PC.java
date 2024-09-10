package HW2.Task2;

public class PC {
    private String pcName;
    private String processorName;
    private double frequency;
    private int ram;
    public PC(){

    }
    public PC(String pcName, String processorName, double frequency, int ram) {
        this.pcName = pcName;
        this.processorName = processorName;
        this.frequency = frequency;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return pcName + ": {" +
                "Processor Name: " + processorName +
                ", frequency: " + frequency + "Ghz" +
                ", ram: " + ram + "GB";
    }
}
