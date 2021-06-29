package pro.sdacademy.designpatterns.creational.abstractfactory;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */
public interface CarFactory {

  Car createSedan();

  Car createCombi();

  Car createHatchback();
}
