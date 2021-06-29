package pro.sdacademy.designpatterns.creational.abstractfactory;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */
public abstract class AudiA4 extends AbstractCar {
  @Override
  public String getModelName() {
    return "A4";
  }

  @Override
  public String getProducer() {
    return "Audi";
  }
}
