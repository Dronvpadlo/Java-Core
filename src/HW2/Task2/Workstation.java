package HW2.Task2;

import HW2.Task2.Laptop;

public class Workstation extends Laptop {
    String gpuName;
    int gpuMemory;
    public Workstation(){

    }

    public Workstation(String pcName, String processorName, double frequency, int ram, double displaySize, boolean keyboardLighting, String gpuName, int gpuMemory) {
        super(pcName, processorName, frequency, ram, displaySize, keyboardLighting);
        this.gpuName = gpuName;
        this.gpuMemory = gpuMemory;
    }

    public Number getGpuMemory() {
        return gpuMemory;
    }

    public void setGpuMemory(int gpuMemory) {
        if (gpuMemory>0) {
            this.gpuMemory = gpuMemory;
        }
    }

    @Override
    public String toString() {
        super.toString();
        return super.toString() +
                ", gpuName='" + gpuName + '\'' +
                ", gpuMemory=" + gpuMemory +
                "GB}";
    }
}
