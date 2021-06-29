package pro.sdacademy.designpatterns.creational.factory;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */
public class FactoryMethodUsage {

  public static void main(String[] args) {
    //final String type = args[0];
    final String type = "PC";

    GameFactory gameFactory;
    if (type.equals("PC")) {
      gameFactory = new ValorantGameCreator();
    } else if (type.equals("Board")) {
      gameFactory = new MonopolyGameCreator();
    } else {
      throw new RuntimeException("unknown game type");
    }

    Game createdGame = gameFactory.create();
    System.out.println("Created game " + createdGame);
  }
}
