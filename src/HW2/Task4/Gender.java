package HW2.Task4;

public enum Gender {
    MALE("Male"), FEMALE("female"), NON_BINARY("Non Binary");
    private String gender;

    Gender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return gender;
    }
}
