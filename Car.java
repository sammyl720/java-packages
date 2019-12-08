package vehiclepackage;
class Car extends Vehicle {
  private String modelName = "Mustang"; // Car attribute
  public static void main(String[] args){
    // create a MyCar object
    Car myCar = new Car();

    // Call the honk() method (from the Vehicle class) on the myCar object
    myCar.honk();
    
    // Display the value of the brand attribute (frmo the Vehicle class) and value of the modelName from the car class
    System.out.println(myCar.brand + " " + myCar.modelName);
  }
    
}