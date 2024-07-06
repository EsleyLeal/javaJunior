public abstract class AbstractVehicle implements Mobable {

    private String brand;
    private String model;
  
    public AbstractVehicle(String brand, String model) {
      this.brand = brand;
      this.model = model;
    }
  
    public void displayInfo() {
      System.out.println("Brand: " + brand + ", Model: " + model);
  }
  
    public abstract void fuelUp();
  
  }
  
  
  