package HW5.Task3;

public class Car {
    //Марка автомобля, потужність двигуна, власник, ціна, рік випуску.
    private String brand;
    private int power;
    private Owner owner;
    private int price;
    private int year;

    public Car() {
    }

    public Car(String brand, int power, int price, int year, String name, int age, int drivingExperience) {
        this.brand = brand;
        this.power = power;
        this.price = price;
        this.year = year;
        this.owner = new Owner(name, age, drivingExperience);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Auto: {" +
                "brand: '" + brand + '\'' +
                ", power: " + power +
                ", owner: " + owner +
                ", price: " + price +
                ", year: " + year +
                '}';
    }
}
