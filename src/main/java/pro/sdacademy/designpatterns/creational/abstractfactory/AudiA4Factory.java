package pro.sdacademy.designpatterns.creational.abstractfactory;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */
public class AudiA4Factory implements CarFactory {

  @Override
  public Car createSedan() {
    return new AudiA4Sedan();
  }

  @Override
  public Car createCombi() {
    return new AudiA4Combi();
  }

  @Override
  public Car createHatchback() {
    return new AudiA4Hatchback();
  }
}
