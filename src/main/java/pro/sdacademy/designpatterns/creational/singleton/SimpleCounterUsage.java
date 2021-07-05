package pro.sdacademy.designpatterns.creational.singleton;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */
public class SimpleCounterUsage {

  public static void main(String[] args) {
    
    SimpleCounter simpleCounterA = SimpleCounter.getInstance();
    SimpleCounter simpleCounterB = SimpleCounter.getInstance();
    System.out.println(simpleCounterA == simpleCounterB); // true -> both references point to the same object

    simpleCounterA.increment();
    simpleCounterB.increment();
    System.out.println(simpleCounterA.getCurrentCount() + "=" + simpleCounterB.getCurrentCount()); // 2
  }
}
