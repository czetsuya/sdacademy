package pro.sdacademy.designpatterns.structural.proxy;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */

import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SlackMessageSender implements MessageSender {

  private final List<Message> messages = new ArrayList<>();

  @Override
  public void sendMessage(final String channelName, final String username, final String messageText) {
    final Message message = new Message(channelName, username, messageText);
    log.info("Sent message {}", message);
    messages.add(message);
    log.info("Messages: {}", messages);
  }
}
