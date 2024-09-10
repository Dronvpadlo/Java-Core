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

    public String getProcessorName() {
        return processorName;
    }

    public void setProcessorName(String processorName) {
        this.processorName = processorName;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        if (frequency>0) {
            this.frequency = frequency;
        }
    }

    public String getPcName() {
        return pcName;
    }

    public void setPcName(String pcName) {
        this.pcName = pcName;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        if (ram>0) {
            this.ram = ram;
        }
    }

    @Override
    public String toString() {
        return pcName + ": {" +
                "Processor Name: " + processorName +
                ", frequency: " + frequency + "Ghz" +
                ", ram: " + ram + "GB";
    }
}
