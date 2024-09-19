package HW4.Task2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
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
    }
}
