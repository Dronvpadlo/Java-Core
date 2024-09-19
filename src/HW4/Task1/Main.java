package HW4.Task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Створити List Юзерів
        System.out.println("_________Task1_____________");
        ArrayList<User> users = new ArrayList<>();
        users.add(new User(1, "Aaron Shapiro", 26));
        users.add(new User(7, "Cristian Romero", 32));
        users.add(new User(4, "Martin Eden", 24));
        users.add(new User(12, "Micah Bell", 34));
        users.add(new User(17, "Mike Vogel", 41));

//        - відсортувати  за  віком (зростання , а потім окремо спадання за допомоги методу sort)
        users.sort(((o1, o2) -> o1.getAge() - o2.getAge()));
        System.out.println("відсортувати  за  віком (зростання за допомоги методу sort)");
        System.out.println(users);

        users.sort(((o1, o2) -> o2.getAge() - o1.getAge()));
        System.out.println("відсортувати  за  віком (спадання за допомоги методу sort)");
        System.out.println(users);

//        - відсортувати його за кількістю знаків в імені  (зростання , а потім окремо спадання)
        users.sort((o1, o2) -> o1.getName().length() - o2.getName().length());
        System.out.println("відсортувати його за кількістю знаків в імені (зростання)");
        System.out.println(users);

        users.sort((o1, o2) -> o2.getName().length() - o1.getName().length());
        System.out.println("відсортувати його за кількістю знаків в імені (спадання)");
        System.out.println(users);
    }
}
