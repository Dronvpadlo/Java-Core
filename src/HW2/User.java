package HW2;

public class User {
    public int id;
    String name;
    String username;
    String email;
    Address address;
    String phone;
    String website;
    Company company;


    public User(){

    }

    public User(int id, String name, String username, String email, Address address, String phone, String website, String companyName, String catchPhrase, String bs) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.website = website;
        this.company = new Company(companyName, catchPhrase, bs);

    }
    public String toString(){
        return name + " {ID: " + id + ", Name: " + name + ", Username: " + username + ", Email: " + email + address + ", Phone: " + phone + ", Website: " + website + company + "}";
    }
}
