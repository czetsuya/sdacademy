package pro.sdacademy.designpatterns.creational.factory;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */
public interface Game {

  String getName();

  String getType();

  int getMinNumberOfPlayers();

  int getMaxNumberOfPlayers();

  boolean canBePlayedRemotely();
}
