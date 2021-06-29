package pro.sdacademy.designpatterns.behavioral.flyweight;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {

  private String producer;
  private String VIN;
  private String version;
  private String modelName;
  private Engine engine;
}