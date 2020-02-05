public class Dog extends AnimalSuper {

    private String region;

    @Override
    public void sound(String noiseInfo) {
        System.out.println("Bark " + noiseInfo);
    }
}