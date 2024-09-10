package HW2;

public class Address extends User{
    String street;
    String suite;
    String city;
    String zipcode;
    Geo geo;

    public Address(){
    }

    public Address(String street, String suite, String city, String zipcode, String lat, String lng) {
        this.street = street;
        this.suite = suite;
        this.city = city;
        this.zipcode = zipcode;
        this.geo = new Geo(lat, lng);
    }
    public String toString(){
        return ", Adress {Street: " + street + ", Suite: " + suite + ", City: " + city + ", Zipcode: " + zipcode + geo + "}";
    }
}

