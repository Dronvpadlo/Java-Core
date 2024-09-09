package HW2;

public class Address extends User{
    String street;
    String suite;
    String city;
    String zipcode;
    public Address(){
    }

    public Address(String street, String suite, String city, String zipcode) {
        this.street = street;
        this.suite = suite;
        this.city = city;
        this.zipcode = zipcode;
    }
}

