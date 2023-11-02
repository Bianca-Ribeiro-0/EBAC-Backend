public abstract class Car {

    private int horsePower;
    private String fuelSource;

    private String color;

    public Car(int horsePower, String fuelSource, String color) {
        this.horsePower = horsePower;
        this.fuelSource = fuelSource;
        this.color = color;
    }
    public void startEngine() {
        System.out.println(getClass().getSimpleName());
        System.out.println("The " + fuelSource + "engine has been started");
        System.out.println("It's ready to utiliza " + horsePower + "horsepowers.n");
    }

    public void clean() {
    System.out.println("The car has been cleaned");
    }

    public void mechanicCheck(){
        System.out.println("The car has been checked by the mechanic");
}
    public void fuelCar(){
        System.out.println("The car has been filled with" + fuelSource);
    }

}