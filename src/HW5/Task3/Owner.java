package HW5.Task3;

public class Owner {
    //Власник автомобіля теж має бути обєкт, у якого є поля
    //Імя, вік, стаж водіння.
    private String name;
    private int age;
    private int drivingExperience;

    public Owner() {
    }

    public Owner(String name, int age, int drivingExperience) {
        this.name = name;
        this.age = age;
        this.drivingExperience = drivingExperience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    @Override
    public String toString() {
        return "{" +
                "name: '" + name + '\'' +
                ", age: " + age +
                ", drivingExperience: " + drivingExperience +
                '}';
    }
}
