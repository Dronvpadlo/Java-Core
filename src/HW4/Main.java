package HW4;

import HW4.Task1.User;
import HW4.Task2.Gender;
import HW4.Task2.Skills;
import HW4.Task2.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
//      Створити List Юзерів
        System.out.println("_________Task1_____________");
        ArrayList<User> users = new ArrayList<>();
        users.add(new User(1, "Aaron Shapiro", 26));
        users.add(new User(7, "Cristian Romero", 32));
        users.add(new User(4, "Martin Eden", 24));
        users.add(new User(12, "Micah Bell", 34));
        users.add(new User(17, "Mike Vogel", 41));

//        - відсортувати  за  віком (зростання , а потім окремо спадання за допомоги методу sort)
        users.sort(((o1, o2) -> o1.getAge() - o2.getAge()));
        System.out.println(users);

        users.sort(((o1, o2) -> o2.getAge() - o1.getAge()));
        System.out.println(users);

//        - відсортувати його за кількістю знаків в імені  (зростання , а потім окремо спадання)
        users.sort((o1, o2) -> o1.getName().length() - o2.getName().length());
        System.out.println(users);

        users.sort((o1, o2) -> o2.getName().length() - o1.getName().length());
        System.out.println(users);


//      створити ArrayList зі словами на 15-20 елементів.
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Southampton");
        strings.add("Arsenal");
        strings.add("Aston Villa");
        strings.add("Bournemouth");
        strings.add("Tottenham");
        strings.add("Brentford");
        strings.add("Brighton and Hove Albion");
        strings.add("Crystal Palace");
        strings.add("Newcastle");
        strings.add("Nottingham Forest");
        strings.add("Man United");
        strings.add("Ipswich Town");
        strings.add("Leicester");
        strings.add("Fulham");
        strings.add("West Ham");
        strings.add("Man City");
        strings.add("Everton");
        strings.add("Chelsea");
        strings.add("Liverpool");
        strings.add("Wolverhampton");
//      - відсортувати його за алфавітом.
        Collections.sort(strings);
        System.out.println("_________Task2_____________");
        System.out.println(strings);

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
        HashSet<Student> studentsTS = new HashSet<>();
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
