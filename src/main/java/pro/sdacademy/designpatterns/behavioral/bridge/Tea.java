package pro.sdacademy.designpatterns.behavioral.bridge;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */
public class Tea implements Drink {

  @Override
  public String getVolume() {
    return "200ml";
  }

  @Override
  public boolean isAddictive() {
    return false;
  }

  @Override
  public int getNumberOfSugarLumps() {
    return 5;
  }

  @Override
  public Taste getTaste() {
    return Taste.SWEET;
  }
}
