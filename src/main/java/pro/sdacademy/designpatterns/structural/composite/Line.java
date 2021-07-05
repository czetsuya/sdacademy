package pro.sdacademy.designpatterns.structural.composite;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */
public interface Line {

  void draw(double lengthInPixels);

  void setStartingPosition(Point position);

  Point getStartingPoint();
}
