public class Cat extends AnimalSuper {

    private String region;

    @Override
    public void sound(String noiseInfo) {
        System.out.println("Miau " + noiseInfo);
    }
}