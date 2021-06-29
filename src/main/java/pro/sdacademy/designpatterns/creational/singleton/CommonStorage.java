package pro.sdacademy.designpatterns.creational.singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */
public class CommonStorage {

  private static CommonStorage instance;

  public static CommonStorage getInstance() {

    if (instance == null) { // (1)
      instance = new CommonStorage(); // (2)
    }
    return instance;
  }

  public static CommonStorage getInstanceInMultiThread() {

    if (instance == null) { // (1)
      synchronized (CommonStorage.class) {
        if (instance == null) { // (2)
          instance = new CommonStorage();
        }
      }
    }
    return instance;
  }

  private List<Integer> values = new ArrayList<>();

  private CommonStorage() {
  }

  public void addValue(final int value) {
    values.add(value);
  }

  public List<Integer> getValues() {
    return values;
  }
}
