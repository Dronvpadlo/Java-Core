package HW1;

public class Car {
    private String model;
    private int power;
    private double volumeEngine;
    private boolean turbo;

    public Car(String model, int power, double volumeEngine, boolean turbo) {
        this.model = model;
        this.power = power;
        this.volumeEngine = volumeEngine;
        this.turbo = turbo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getVolumeEngine() {
        return volumeEngine;
    }

    public void setVolumeEngine(double volumeEngine) {
        if (volumeEngine>0){
            this.volumeEngine = volumeEngine;
        }
    }

    public boolean getTurbo() {
        return turbo;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }
    public String toString(){
        return "{Model: " + model +
                ", Power: " + power +
                ", Volume Engine " + volumeEngine +
                ", Turbo: " + turbo+ "}";
    }
}

