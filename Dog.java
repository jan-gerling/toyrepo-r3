public class Dog extends AnimalSuper {

    @Override
    public void sound(String noiseInfo) {
        System.out.println("Bark " + noiseInfo);
    }

    public void walk(String info) {
        System.out.print("Walking as a " + info);
    }
}