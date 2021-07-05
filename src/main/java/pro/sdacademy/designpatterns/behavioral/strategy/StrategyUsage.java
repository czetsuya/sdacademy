package pro.sdacademy.designpatterns.behavioral.strategy;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */
public class StrategyUsage {

  public static void main(String[] args) {

    final StrategyType strategyType = StrategyType.valueOf("REMOVE");
    final String input = "hello from SDA knowledge base!";

    final SpacesModificationStrategyProvider provider = new SpacesModificationStrategyProvider();

    SpacesModificationStrategy strategy = provider.get(strategyType);
    final String output = strategy.modify(input);
    System.out.println("Result is " + output);
  }
}
