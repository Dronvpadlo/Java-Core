package HW1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Book[] books = new Book[5];
        books[0] = new Book("Black Obelisk", 288, "Erick Maria Remark", "Drama");
        books[1] = new Book("Martin Eden", 332, "Jack London", "Drama");
        books[2] = new Book("Hearts in Atlantic", 448, "Stephen King", "Scared");
        books[3] = new Book("The Great Gatsby", 195, "Francis Scott Fitzgerald", "Drama");
        books[4] = new Book("Horns", 376, "Joe Hill", "Scared");
        System.out.println(Arrays.toString(books));

        Car[] cars = new Car[5];
        cars[0] = new Car("Audi", 5000, 3.2, true);
        cars[1] = new Car("Honda", 4000, 5.4, false);
        cars[2] = new Car("Dodge", 4800, 3.0, false);
        cars[3] = new Car("McLaren", 6000, 5.8, true);
        cars[4] = new Car("Acura", 2000, 1.8, false);
        System.out.println(Arrays.toString(cars));

        Dog dog1 = new Dog("Carter", 4, "Boxer");
        Dog dog2 = new Dog("Ashley", 2, "German Shepherd");
        Dog dog3 = new Dog("Eugenie", 1, "Poodle");
        Dog dog4 = new Dog("Rudie", 6, "Beagle");
        Dog dog5 = new Dog("Aaron", 3, "Alaskan Malamute");
        ArrayList<Dog> arrayList = new ArrayList<Dog>();
        arrayList.add(dog1);
        arrayList.add(dog2);
        arrayList.add(dog3);
        arrayList.add(dog4);
        arrayList.add(dog5);
        System.out.println(arrayList);
        }
    }
