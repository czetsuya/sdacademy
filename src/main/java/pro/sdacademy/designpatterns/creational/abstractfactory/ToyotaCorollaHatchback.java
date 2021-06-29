package pro.sdacademy.designpatterns.creational.abstractfactory;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */
public class ToyotaCorollaHatchback extends ToyotaCorolla {

  @Override
  public Type getType() {
    return Type.HATCHBACK;
  }

  @Override
  public Integer getCylindersNum() {
    return 4;
  }

  @Override
  public Float getEngineVolume() {
    return 2.0F;
  }

  @Override
  public Integer getTrunkSize() {
    return 420;
  }
}