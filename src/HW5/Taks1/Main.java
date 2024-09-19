package HW5.Taks1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //створити ArrayList зі словами на 15-20 елементів.
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Bologna");
        strings.add("AC Milan");
        strings.add("Como");
        strings.add("Napoli");
        strings.add("Empoli");
        strings.add("Juventus");
        strings.add("Inter Milan");
        strings.add("Udinese");
        strings.add("Venecia");
        strings.add("Lazio");
        strings.add("Roma");
        strings.add("Parma");
        strings.add("Torino");
        strings.add("Verona");
        strings.add("Cagliari");
        strings.add("Fiorentina");
        strings.add("Atalanta");
        strings.add("Genoa");
        strings.add("Monca");
        strings.add("Lecce");
        Stream<String> stream = strings.stream();
        List<String> collect = stream
                .sorted() //- відсортувати його за алфавітом .
                .filter(string -> string.length() < 5) //*-- відфільтрувати слова довжиною менше 4 символів (Використав менше 5, бо менше 4 не було в лісті)
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
