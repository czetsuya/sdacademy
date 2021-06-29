package pro.sdacademy.designpatterns.creational.abstractfactory;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */
public abstract class ToyotaCorolla extends AbstractCar {

  @Override
  public String getModelName() {
    return "Corolla";
  }

  @Override
  public String getProducer() {
    return "Toyota";
  }
}
