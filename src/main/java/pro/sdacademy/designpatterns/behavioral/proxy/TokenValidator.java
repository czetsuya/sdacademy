package pro.sdacademy.designpatterns.behavioral.proxy;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */

import java.util.Random;
import java.util.UUID;

public class TokenValidator {

  boolean isExpired(final UUID token) {
    return new Random().nextBoolean(); // for example purposes
  }
}
