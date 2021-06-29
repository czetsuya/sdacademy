package pro.sdacademy.designpatterns.creational.builder;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */
public class ToyBuilderUsage {

  public static void main(String[] args) {

    final Toy toy = new ToyBuilder()
        .withMadeOf("plastic")
        .withName("Matchbox car")
        .withType("Small car")
        .build();
    System.out.println(toy);
  }
}
