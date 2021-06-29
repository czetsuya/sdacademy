package pro.sdacademy.test.fundamentals.assertj;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */
import java.util.OptionalInt;

public class Numbers {

  public OptionalInt findFirstDigit(final String number) {
//    for(var i = 0; i <number.length();i++) {
//      char c=number.charAt(i);
//      if(Character.isDigit(c)) {
//        return OptionalInt.of(Character.getNumericValue(c));
//      }
//    }
//    return OptionalInt.empty();
    return number.chars()
        .filter(Character::isDigit)
        .map(Character::getNumericValue)
        .findFirst();
  }
}
