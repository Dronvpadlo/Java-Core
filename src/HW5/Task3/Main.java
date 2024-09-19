package HW5.Task3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Створити клас автомобіля з полями:
        //Марка автомобля, потужність двигуна, власник, ціна, рік випуску.
        //Власник автомобіля теж має бути обєкт, у якого є поля
        //Імя, вік, стаж водіння.
        //Створити не менше 7 та не більше 20 машинок.
        //Зробили половині автопарку ремонт мотору, що збільшить потужність автомобілів на 10% (переприсвоєння змінної потужності).
        //Після того в масиві цих автівок зробити перевірку досвіду ВСІХ наших водіїв.
        //Якщо досвід водія менший за 5 років, але його вік більший за 25, то необідно відправити його на курси підвищення кваліфікації, що збільшить йому досвід на 1 рік.
        //Також спробуйте порахувати суму, яку потрібно потратити для покупки всіх цих авто

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", 250, 4000, 2019, "Melvin", 29, 4));
        cars.add(new Car("Dodge", 260, 9000, 2014, "Adrian", 24, 3));
        cars.add(new Car("Alfa Romeo", 180, 8600, 2016, "Annet", 21, 3));
        cars.add(new Car("Chevrolet", 140, 7700, 2008, "Deki", 27, 5));
        cars.add(new Car("Nissan", 320, 11000, 2012, "Dominic", 29, 6));
        cars.add(new Car("BMW", 340, 19080, 2016, "Razor", 38, 12));
        cars.add(new Car("Acura", 190, 7400, 2009, "Sadie", 29, 2));
        cars.add(new Car("Volkswagen", 120, 4000, 2002, "Andrew", 26, 7));
        System.out.println("_________All Cars__________");
        cars.forEach(System.out::println);


        int halfCars = cars.size()/2;
        List<Car> toSort = new ArrayList<>(cars);
        toSort.sort(Comparator.comparing(Car::getPower));
        List<Car> updatedCars = new ArrayList<>();
        long limit = halfCars;
        for (Car car1 : toSort) {
            if (limit-- == 0) break;
            car1.setPower((int) (car1.getPower() * 1.1));
            updatedCars.add(car1);
        }
        System.out.println("_________Updated Power__________");
        updatedCars.forEach(System.out::println);


        List<Car> checkDrivingExperience = cars.stream()
                .filter(car -> car.getOwner().getDrivingExperience()<5)
                .filter(car -> car.getOwner().getAge()>25)
                .peek(car -> car.getOwner().setDrivingExperience((int)(car.getOwner().getDrivingExperience()+1)))
                .toList();
        System.out.println("_________Check Driv. Exp__________");
        checkDrivingExperience.forEach(System.out::println);

        int totalPrice = cars.stream()
                .mapToInt(Car::getPrice)
                .sum();
        System.out.println("_________Total Cost__________");
        System.out.println("Total Price of all cars is " + totalPrice);
    }
}
