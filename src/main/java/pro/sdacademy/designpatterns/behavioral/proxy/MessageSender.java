package pro.sdacademy.designpatterns.behavioral.proxy;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */
public interface MessageSender {

  void sendMessage(String channelName, String username, String message);
}
