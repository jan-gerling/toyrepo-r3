import inheritance.superinfo.AnimalSuper;

public class Dog extends AnimalSuper {

    private String breed;

    @Override
    public void sound(String noiseInfo) {
        System.out.println("Bark " + noiseInfo);
    }
}