package HW4.Task4;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Zooclub {
    private final Map<Person , List<Pet>> club = new HashMap<>();
    private String _inputString(){
        return new Scanner(System.in).nextLine();//Метод для зчитування Стрінги з терміналу
    }
    private int _inputInt(){
        return new Scanner(System.in).nextInt();//Метод для зчитування Цілочисельних значень з терміналу
    }
    private Map.Entry<Person, List<Pet>> _entryByPersonId(){
        int personId = this._inputInt();
        return this.club.entrySet().stream().filter(item -> item.getKey().getId() == personId).findFirst().orElse(null);
    }
    private void addPerson(){
        Integer id = this.club
                .keySet()
                .stream()
                .max(Comparator.comparing(Person::getId))//визначаємо максимальне ID щоб додати наступне
                .map(person -> person.getId()+1)//реалізуємо додавання нового ID
                .orElse(1);//Якщо немає ID то обираємо ID: 1
        System.out.print("Enter person name: ");
        String name = _inputString();
        this.club.put(new Person(id, name), new ArrayList<>());
    }
    private boolean showAllPersons() {
        if (this.club.isEmpty()) {
            return false;
        }
        System.out.println("___Zoo Club___");
        this.club.forEach((person, pets) -> {
            System.out.println(person.getId() + ". Person: " + person + " Pets: " + pets);
        });
        return true;
    }
    private void showPetType(){
        PetType[] petTypes = PetType.values();

        for (int i = 0; i < petTypes.length; i++) {
            System.out.println(i + ": " + petTypes[i]);
        }

        System.out.print("Make your choice: ");
        int index = this._inputInt();
    }
    private void addPet(){
        if(this.showAllPersons()){
            System.out.print("Add pet to person: ");
            Map.Entry<Person, List<Pet>> personListEntry = this._entryByPersonId();
            if(personListEntry != null){
                PetType[] petTypes = PetType.values();

                for (int i = 0; i < petTypes.length; i++) {
                    System.out.println(i + ": " + petTypes[i]);
                }

                System.out.print("Make your choice: ");
                int index = this._inputInt();
                System.out.print("Enter pet name: ");
                String name = this._inputString();
                System.out.print("Enter pet age: ");
                int age = this._inputInt();
                Integer id = personListEntry
                        .getValue()
                        .stream()
                        .max(Comparator.comparingInt(Pet::getId))
                        .map(pet -> pet.getId()+1)
                        .orElse(1);
                personListEntry.getValue().add(new Pet(id, name, petTypes[index], age));
            }else {

                System.out.println("________________"+ "\n" + "Person not Found");
            }
        }
        else {
            System.out.println("________________"+ "\n" + "Club is Empty");
        }

    }
    private void deletePetFromPerson(){
        if(this.showAllPersons()){
            System.out.println("Delete pet from person number: ");
            Map.Entry<Person, List<Pet>> personListEntry = this._entryByPersonId();

            if (personListEntry == null){
                System.out.println("Person was not found");
                return;
            }

            personListEntry.getValue().forEach(pet -> {
                System.out.println(pet.getId() + ". " + pet);
            });

            System.out.print("Choice number of pet: ");
            int id = this._inputInt();
            personListEntry.getValue().removeIf(pet -> pet.getId() == id);
        }
    }
    private void deletePerson(){
        if(!this.showAllPersons()) {
            return;
        }
        System.out.print("Choice number of person: ");
        Map.Entry<Person, List<Pet>> personListEntry = this._entryByPersonId();

        if (personListEntry == null){
            System.out.println("Person not found");
            return;

        }
            this.club.remove(personListEntry.getKey());

    }
    private void deletePetByType(){
        PetType[] petTypes = PetType.values();

        for (int i = 0; i < petTypes.length; i++) {
            System.out.println(i + ": " + petTypes[i]);
        }

        System.out.println("Choice type of pets to delete: ");
        int index = this._inputInt();

        this.club.values().forEach(pets -> pets.removeIf(pet -> pet.getPetType() == petTypes[index]));
    }
    public void menu(){
        while (true){
            System.out.println("1. Add person to club");
            System.out.println("2. Add pet to person");
            System.out.println("3. Show Club");
            System.out.println("4. Delete pet from Person");
            System.out.println("5. Delete person");
            System.out.println("6. Delete pet by type");
            System.out.println("9. Quit");

            System.out.print("Enter number: ");
            String choice = this._inputString();

            switch (choice){
                case "1":
                    this.addPerson();
                    break;
                case "2":
                    this.addPet();
                    break;
                case "3":
                    this.showAllPersons();
                    break;
                case "4":
                    this.deletePetFromPerson();
                    break;
                case "5":
                    this.deletePerson();
                    break;
                case "6":
                    this.deletePetByType();
                    break;
                case "9":
                    return;
            }
        }
    }
}
