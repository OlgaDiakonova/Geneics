
public class Cat extends Animal implements Containable{

    private String name;
    private String family;


    public Cat(String name, String fam) {
        this.name = name;
        this.family = fam;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    @Override
    public String getFamily() {
        return family;
    }
}
