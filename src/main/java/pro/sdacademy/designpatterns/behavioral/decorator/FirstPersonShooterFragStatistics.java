package pro.sdacademy.designpatterns.behavioral.decorator;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */
public class FirstPersonShooterFragStatistics implements FragStatistics {

  private int fragsCount = 0;
  private int deathCount = 0;

  @Override
  public int incrementFragCount() {
    fragsCount++;
    return fragsCount;
  }

  @Override
  public int incrementDeathCount() {
    deathCount++;
    return deathCount;
  }

  @Override
  public void reset() {
    fragsCount = 0;
    deathCount = 0;
  }
}
