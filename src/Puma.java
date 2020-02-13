
public class Puma extends Animal {
    private String name;
    private String family;


    public Puma(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getFamily() {
        return null;
    }
}
