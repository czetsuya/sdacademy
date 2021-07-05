package pro.sdacademy.designpatterns.behavioral.template;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */

import java.util.Random;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StringBuilderAppendPerformanceTest extends PerformanceTestTemplate {

  private static final int CHARS_NUM = 1000000;

  @Override
  protected int getWarmUpIterationsNum() {
    return 2;
  }

  @Override
  protected int getIterationsNum() {
    return 100;
  }

  @Override
  protected void iteration() {
    final Random random = new Random();
    final StringBuilder stringBuilder = new StringBuilder();
    for (int idx = 0; idx < CHARS_NUM; idx++) {
      stringBuilder.append(Math.abs(random.nextInt() % 128));
    }
    log.trace(stringBuilder.toString());
  }
}
