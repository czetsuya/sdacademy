package pro.sdacademy.designpatterns.behavioral.observer;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */
public abstract class BaseObserver {

  protected final ChatChannel chatChannel;

  public BaseObserver(final ChatChannel chatChannel) {
    this.chatChannel = chatChannel;
    chatChannel.subscribe(this);
  }

  public abstract void handleMessage(String message, String userType);

  public abstract String getObserverType();

  public void sendMessage(final String message) {
    chatChannel.sendMessage(message, getObserverType());
  }
}