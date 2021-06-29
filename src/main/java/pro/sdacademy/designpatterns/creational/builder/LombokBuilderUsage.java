package pro.sdacademy.designpatterns.creational.builder;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */
public class LombokBuilderUsage {

  public static void main(String[] args) {
    GraphicsCard graphicsCard = GraphicsCard.builder()
        .memoryInMb(2048)
        .modelName("GF1660")
        .producer("Asus")
        .series("1xxx")
        .build();
    System.out.println(graphicsCard);
  }
}