package pro.sdacademy.designpatterns.creational.abstractfactory;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */
public interface Car {
  Type getType();
  String getModelName();
  Integer getCylindersNum();
  String getProducer();
  Float getEngineVolume();
  Integer getTrunkSize();
}
