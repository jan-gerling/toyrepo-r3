public class Dog extends Animal {

    @Override
    public void sound(String noiseInfo) {
        System.out.println("Bark " + noiseInfo);
    }

    public void catchBall() {
        System.out.print("This is for dog only :P");
    }


}