package HW2.Task3;

public class Papirus {
    private String materials;
    public Papirus(){

    }
    public Papirus(String materials) {
        this.materials = materials;
    }

    public String getMaterials() {
        return materials;
    }

    public void setMaterials(String materials) {
        this.materials = materials;
    }

    @Override
    public String toString() {
        return "Papirus{" +
                "materials='" + materials + '\'' +
                '}';
    }
}
