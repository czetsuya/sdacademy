package pro.sdacademy.designpatterns.creational.singleton;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */
public enum SimpleCounterEnum {
  INSTANCE;

  private int currentCount = 0;

  public int getCurrentCount() {
    return currentCount;
  }

  public void increment() {
    currentCount++;
  }
}
