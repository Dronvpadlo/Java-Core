package HW5.Taks2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //- Створити масив з 20 числами.
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(7);
        integers.add(12);
        integers.add(5);
        integers.add(90);
        integers.add(9);
        integers.add(15);
        integers.add(4);
        integers.add(17);
        integers.add(30);
        integers.add(19);
        integers.add(69);
        integers.add(2);
        integers.add(3);
        integers.add(11);
        integers.add(6);
        integers.add(14);
        integers.add(8);
        integers.add(16);
        integers.add(0);
        Stream<Integer> stream = integers.stream();
            stream
                .sorted()  //- за допомогою способу sorted відсортувати масив.
                .filter(integer -> integer % 3 == 0) //-- за допомогою filter отримати числа кратні 3
                .filter(integer -> integer % 10 == 0) //-- за допомогою filter отримати числа кратні 10
                .map(integer -> integer * 3)  //-- перебрати масив за допомогою map() і отримати новий масив, в якому всі значення будуть у 3 рази більші
                .collect(Collectors.toList())
                .forEach(integer -> System.out.println(integer)); //-- перебрати (проітерувати) масив за допомогою foreach()


    }
}
