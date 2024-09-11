package HW3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //а) Оприділити інтерфейс Printable, який містить метод void print().
        //б) Оприділити клас Book, що реалізує інтерфейс Printable.
        //в) Оприділити клас Magazine, що реалізує інтерфейс Printable.
        //г) Створити масив типу Printable, який буде містити книги та журнали.
        ArrayList<Printable> books = new ArrayList<>();
        books.add(new Book("Vladimir Nabokov", "The Eye", 189));
        books.add(new Book("Richard Bachman", "Blaze", 89));
        books.add(new Book("Erick Maria Remark", "Schatten im Paradies", 468));
        books.add(new Magazine("DC", "DC", 18, "April", false));

        for (Printable item : books){
            item.print();
        }

        //Створити інтерфейс Instrument та реалізовуючі його класи "Гітара", "Барабан"  та "Труба" .
        //Інтерфейс Instrument  містить метод play().
        //Клас "Гітара" містить змінну класу "кількістьСтрун",
        //клас "Барабан" - розмір, а клас "Труба" - діаметр.
        //Створити масив типу "Інструмент" (Instrument), що містить інструменти різних типів.
        //У циклі викликати метод play() для кожного інструменту,
        //який повинен виводити рядок "Грає такий-то інструмент з такими-то характеристиками".
    }
}
