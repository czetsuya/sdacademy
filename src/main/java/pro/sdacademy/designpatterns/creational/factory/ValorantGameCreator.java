package pro.sdacademy.designpatterns.creational.factory;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */
public class ValorantGameCreator implements GameFactory {

  @Override
  public Game create() {
    return new PCGame("Valorant", "FPS", 4, 10, true);
  }
}
