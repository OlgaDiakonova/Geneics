
public class Test {

    public static void main(String[] args){
        Cat cat = new Cat("cat Bom", "");
        ShippingContainer catContainer = new ShippingContainer("cat container", "");

        Dog dog = new Dog("dog Funt");
        ShippingContainer dogContainer = new ShippingContainer("dog container", "");


        ServiceClass sc = new ServiceClass();
        sc.putSpecies(cat, catContainer);
        System.out.println("Animal " + cat.getName() + " was put into container " + catContainer.getName());
        sc.putSpecies(dog, dogContainer);
        System.out.println("Animal " + dog.getName() + " was put into container " + dogContainer.getName());




    }
}
