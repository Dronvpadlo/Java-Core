package HW2.Task4;

import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Gender gender;
    private ArrayList<Skills> skills;
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
    public String toString() {
        return "Student: {" + ",\n" +
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
