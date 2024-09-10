package Task1;

public final class Company extends User {
    private String name;
    private String catchPhrase;
    private String bs;

    public Company(String name, String catchPhrase, String bs) {
        this.name = name;
        this.catchPhrase = catchPhrase;
        this.bs = bs;
    }
    public String toString(){
        return ", Company {Name: " + name + ", CatchPhrase: " + catchPhrase + ", BS: " + bs + "}";
    }
}
