public abstract class Animal {

    private String breed;

    private String region;

    public abstract void sound(String noise);

    public void walk(String info) {
        System.out.print("Walking as a " + info);
    }



}
