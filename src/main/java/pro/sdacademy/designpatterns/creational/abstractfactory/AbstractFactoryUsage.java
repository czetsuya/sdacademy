package pro.sdacademy.designpatterns.creational.abstractfactory;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */
public class AbstractFactoryUsage {

  public static void main(String[] args) {

    for (CarType type : CarType.values()) {
      System.out.println("CarType " + type);
      CarFactory factory = new FactoryProvider().createFactory(type);
      Car combi = factory.createCombi();
      Car sedan = factory.createSedan();
      Car hatchBack = factory.createHatchback();
      System.out.println(combi);
      System.out.println(sedan);
      System.out.println(hatchBack);
    }
  }
}
