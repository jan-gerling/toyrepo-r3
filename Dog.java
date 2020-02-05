import inheritance.superinfo.AnimalSuper;

public class Dog extends AnimalSuper {

    @Override
    public void sound(String noise) {
        System.out.println("Bark " + noise);
    }
}