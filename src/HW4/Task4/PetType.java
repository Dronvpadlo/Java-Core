package HW4.Task4;

public enum PetType {
    CAT("Cat"), DOG("Dog"), RABBIT("Rabbit"), HAMSTER("Hamster");
    private final String petType;

    PetType(String petType) {
        this.petType = petType;
    }

    @Override
    public String toString() {
        return petType;
    }
}
