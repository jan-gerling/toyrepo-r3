public class Cat extends AnimalSuper {


    @Override
    public void sound(String noiseInfo) {
        System.out.println("Miau " + noiseInfo);
    }

    public void walk(String info) {
        System.out.print("Walking as a " + info);
    }
}