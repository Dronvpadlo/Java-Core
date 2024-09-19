package HW4;

import HW4.Task1.User;
import HW4.Task3.Gender;
import HW4.Task3.Skills;
import HW4.Task3.Student;

import java.util.*;

public class Main {
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

//        Створити TreeSet з 10 об'єктів, посортовану за кількістю скілів від меньшого до більшого
        Set<Student> studentsTS = new TreeSet<>();
        studentsTS.add(new Student(1, "Igor", "Zelenyavski", "zelen@gmail.com", 31, Gender.MALE, allSkills, "Toyota", 2020, 250));
        studentsTS.add(new Student(2, "Elizabet", "Treloni", "Lis22@gmail.com", 19, Gender.FEMALE, python, "Chevrolet", 2016, 320));
        studentsTS.add(new Student(14, "Garry", "Straub", "strega22@i.com", 51, Gender.MALE, java));
        studentsTS.add(new Student(27, "Andrii", "Doronyuk", "skdron7272@gmail.com", 26, Gender.MALE, allSkills, "Acura", 2016, 180));
        studentsTS.add(new Student(17, "Valentin", "Yankovski", "yannix@gmail.com", 24, Gender.MALE, python, "Land Rover", 2021, 380));
        studentsTS.add(new Student(4, "Annabel", "Anderson", "bellaund22@gmail.com", 27, Gender.FEMALE, js, "Alfa Romeo", 2014, 220));
        studentsTS.add(new Student(7, "Abigail", "Rishche", "bigibigi88@gmail.com", 34, Gender.FEMALE, js, "Aston Martin", 2019, 270));
        studentsTS.add(new Student(11, "Fridrich", "Kemmerich", "kemp54@gmail.com", 32, Gender.MALE, js, "Opel", 2011, 250));
        studentsTS.add(new Student(24, "Alessandro", "Orsolini", "italorsol442@gmail.com", 24, Gender.MALE, java, "Ferrari", 2021, 340));
        studentsTS.add(new Student(23, "Margarita", "Moses", "marGo@gmail.com", 37, Gender.FEMALE, allSkills));
        System.out.println("_________Task3.2_____________");
        System.out.println(studentsTS);


//        Створити клас Зооклуб. В цьому класі створити одне поле: private Map <Person, List <Pet>> club;
//        В зооклубі створити методи, та застосувати їх
//        1) додати учасника в клуб;
//        2) додати тваринку до учасника клубу.
//        3) видалити тваринку з власника.
//        4) видалити учасника клубу.
//        5) видалити конкретну тваринку з усіх власників.
//        6) вивести на екран зооклуб.
//        Подумати яким повинен бути Person, щоб була можливість додавати йому тваринку.
//                Подумати яким повинен бути Pet, щоб була можливість видаляти конкретну тваринку


    }
}
