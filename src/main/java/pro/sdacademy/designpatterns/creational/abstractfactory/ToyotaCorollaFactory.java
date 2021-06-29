package pro.sdacademy.designpatterns.creational.abstractfactory;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */
public class ToyotaCorollaFactory implements CarFactory {

  @Override
  public Car createSedan() {
    return new ToyotaCorollaSedan();
  }

  @Override
  public Car createCombi() {
    return new ToyotaCorollaCombi();
  }

  @Override
  public Car createHatchback() {
    return new ToyotaCorollaHatchback();
  }
}
