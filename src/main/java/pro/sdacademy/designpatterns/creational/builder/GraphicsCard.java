package pro.sdacademy.designpatterns.creational.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GraphicsCard {

  private int memoryInMb;
  private String producer;
  private String series;
  private String modelName;
}
