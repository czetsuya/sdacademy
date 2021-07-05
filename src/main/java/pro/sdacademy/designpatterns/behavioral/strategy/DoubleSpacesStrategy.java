package pro.sdacademy.designpatterns.behavioral.strategy;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */
public class DoubleSpacesStrategy implements SpacesModificationStrategy {

  @Override
  public String modify(final String input) {
    final StringBuilder stringBuilder = new StringBuilder(input.length());
    for (final char c : input.toCharArray()) {
      if (c != ' ') {
        stringBuilder.append(c);
      } else {
        stringBuilder.append("  ");
      }
    }
    return stringBuilder.toString();
  }
}
