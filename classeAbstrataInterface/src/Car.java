public class Car extends AbstractVehicle {

    public Car(String brand, String model) {
      super(brand, model);
  }

  @Override
    public void move() {
        System.out.println("The car is moving.");
    }

    @Override
    public void stop() {
        System.out.println("The car has stopped.");
    }

    @Override
    public void fuelUp() {
        System.out.println("The car is fueling up.");
    }

}
