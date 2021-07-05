package pro.sdacademy.designpatterns.behavioral.mediator;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */
public interface Component {

  void sendRequest();

  default void sendRequest(String context) {
    sendRequest();
  }
}
