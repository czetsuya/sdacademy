package pro.sdacademy.designpatterns.creational.abstractfactory;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */
public abstract class AbstractCar implements Car {

  @Override
  public String toString() {
    return "Car: " + getProducer() + " " + getModelName() + " " + getType() + " has " + getCylindersNum() + " cylinders"
        +
        " and engine: " + getEngineVolume() + " and trunk with size " + getTrunkSize() + " litres";
  }
}
