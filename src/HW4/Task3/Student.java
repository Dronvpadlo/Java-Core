package HW4.Task3;

import java.util.ArrayList;

public class Student implements Comparable<Student> {
    private final int id;

    private final String name;
    private final String surname;
    private final String email;
    private final int age;
    public Gender gender;
    private final ArrayList<Skills> skills;
    private Car car;

    public Student(int id, String name, String surname, String email, int age, Gender gender, ArrayList<Skills> skills, String model, int year, int power) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.skills = skills;
        this.car = new Car(model, year, power);
    }
    public Student(int id, String name, String surname, String email, int age, Gender gender, ArrayList<Skills> skills) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.skills = skills;
    }
    @Override
    public int compareTo(Student o) {
        return this.skills.size() - o.getSkills().size();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public ArrayList<Skills> getSkills() {
        return skills;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "\nStudent: "+ name + ": {" + ",\n" +
                "ID: " + id + ",\n" +
                "Name: " + name + ",\n" +
                "Surname: " + surname + ",\n" +
                "Email: " + email + ",\n" +
                "Age: " + age + ",\n" +
                "Gender: " + gender + ",\n" +
                "Skills: " + skills + ",\n" +
                "Car: " + car + ",\n" +
                '}';
    }
}
