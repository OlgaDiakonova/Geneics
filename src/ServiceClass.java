
import java.util.ArrayList;

public class ServiceClass<T extends Animal> {

    public void putSpecies(T animal, ShippingContainer cont){
        cont.setAnimal(animal);

    }

    public void putFamilies(ArrayList<T> animals, ShippingContainer cont){
        for(int i = 0; i < animals.size(); i++){
            if(animals.get(i).getFamily() == cont.getFamily()){
               cont.setAnimFamily(animals.get(i));

            }
        }
    }
}
