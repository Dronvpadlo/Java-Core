package HW4.Task4;

public class Pet {
    private int id;
    private String name;
    private PetType petType;
    private int age;

    public Pet() {
    }

    public Pet(int id, String name, PetType petType, int age) {
        this.id = id;
        this.name = name;
        this.petType = petType;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PetsList: {" +
                "id: " + id +
                ", name: " + name +
                ", petType: " + petType +
                ", age: " + age +
                '}';
    }
}
