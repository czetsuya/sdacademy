package pro.sdacademy.designpatterns.creational.factory;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */
public class MonopolyGameCreator implements GameFactory {

  @Override
  public Game create() {
    return new BoardGame("Monopoly", "Family Game", 4);
  }
}
