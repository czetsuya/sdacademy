package pro.sdacademy.designpatterns.behavioral.template;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */
public class TemplateMethodUsage {

  public static void main(String[] args) {
    PerformanceTestTemplate testTemplate = new RandomListSortingPerformanceTest();
    testTemplate.run();

    testTemplate = new StringBuilderAppendPerformanceTest();
    testTemplate.run();
  }
}
