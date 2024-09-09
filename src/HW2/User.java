package HW2;

public class User {
    public int id;
    String name;
    String username;
    String email;
    String phone;
    String website;
    public User(){

    }

    public User(int id, String name, String username, String email, String phone, String website) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.website = website;
    }
}
