public class App {
    public static void main(String[] args) throws Exception {
        Car myCar = new Car("Toyota", "Corolla");
            myCar.displayInfo();
            myCar.move();
            myCar.stop();
            myCar.fuelUp();
    }
}
