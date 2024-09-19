package HW4.Task3;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        //                Створити клас котрий відповідає наступній моделі
//        {
//            id: 1,
//                    name: 'vasya',
//                surname: 'pupkin',
//                email: 'asd@asd.com',
//                age: 31,
//                gender: 'MALE',
//                skills: [{title: 'java', exp: 10}, {title: 'js', exp: 10}, {title: 'c++', exp: 10}],
//            car: {model: 'toyota', year: 2021, power: 250}
//        }
//        Використати композицію/агрегацію та енуми в потрібному місці.
//        Створити HashSet з 10 об'єктів, проітерувати її, видалити всіх чоловіків
        HashSet<Student> students = new HashSet<>();

        ArrayList<Skills> java = new ArrayList<>();
        java.add(new Skills("Java", 10));
        ArrayList<Skills> js = new ArrayList<>();
        js.add(new Skills("Js", 10));
        ArrayList<Skills> python = new ArrayList<>();
        python.add(new Skills("Python", 10));
        ArrayList<Skills> allSkills = new ArrayList<>();
        allSkills.add(new Skills("Java", 10));
        allSkills.add(new Skills("Python", 10));
        allSkills.add(new Skills("C++", 10));
        allSkills.add(new Skills("JS", 10));

        students.add(new Student(1, "Igor", "Zelenyavski", "zelen@gmail.com", 31, Gender.MALE, allSkills, "Toyota", 2020, 250));
        students.add(new Student(2, "Elizabet", "Treloni", "Lis22@gmail.com", 19, Gender.FEMALE, python, "Chevrolet", 2016, 320));
        students.add(new Student(14, "Garry", "Straub", "strega22@i.com", 51, Gender.MALE, java));
        students.add(new Student(27, "Andrii", "Doronyuk", "skdron7272@gmail.com", 26, Gender.MALE, allSkills, "Acura", 2016, 180));
        students.add(new Student(17, "Spencer", "Yankovski", "yannix@gmail.com", 24, Gender.MALE, python, "Land Rover", 2021, 380));
        students.add(new Student(4, "Annabel", "Anderson", "bellaund22@gmail.com", 27, Gender.FEMALE, js, "Alfa Romeo", 2014, 220));
        students.add(new Student(7, "Abigail", "Rishche", "bigibigi88@gmail.com", 34, Gender.FEMALE, js, "Aston Martin", 2019, 270));
        students.add(new Student(11, "Fridrich", "Kemmerich", "kemp54@gmail.com", 32, Gender.MALE, js, "Opel", 2011, 250));
        students.add(new Student(24, "Alessandro", "Orsolini", "italorsol442@gmail.com", 24, Gender.MALE, java, "Ferrari", 2021, 340));
        students.add(new Student(23, "Margarita", "Moses", "marGo@gmail.com", 37, Gender.FEMALE, allSkills));
        System.out.println(students);
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.gender == Gender.MALE) {
                iterator.remove();
            }
        }
        System.out.println("_________Task3.1_____________");
        System.out.println(students);


    }
}
