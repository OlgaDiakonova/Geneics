
import java.util.ArrayList;

public class ShippingContainer<T extends Animal>{
    private String name;
    private T animal;
    private ArrayList<T> animFamily;
    private String family;


    public ShippingContainer(String name, String fam) {
        this.name = name;
        this.family = fam;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }


    public ArrayList<T> getAnimFamily() {
        return animFamily;
    }

    public void setAnimFamily(T animal) {

        this.animFamily.add(animal);
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }
}
