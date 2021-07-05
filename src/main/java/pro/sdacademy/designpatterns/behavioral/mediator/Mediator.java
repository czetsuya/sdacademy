package pro.sdacademy.designpatterns.behavioral.mediator;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */
public interface Mediator {

  void sendInfo(Object requester, String context);
}
