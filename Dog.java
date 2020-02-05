public class Dog extends AnimalSuper {

    @Override
    public void sound(String noiseInfo) {
        System.out.println("Bark " + noiseInfo);
    }


}