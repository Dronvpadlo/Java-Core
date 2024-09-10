package HW2.Task1;

public class User {
    private int id;
    private String name;
    private String username;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;


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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id>0) {
            this.id = id;
        }
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return name + " {ID: " + id + ", Name: " + name + ", Username: " + username + ", Email: " + email + address + ", Phone: " + phone + ", Website: " + website + company + "}";
    }
}
