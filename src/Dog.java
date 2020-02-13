
public class Dog extends Animal{
    private String name;
    private String family;


    public Dog(String name) {
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
