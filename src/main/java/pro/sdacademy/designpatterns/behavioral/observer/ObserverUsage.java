package pro.sdacademy.designpatterns.behavioral.observer;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */
public class ObserverUsage {

  public static void main(String[] args) {
    final ChatChannel chatChannel = new ChatChannel("design-patterns");

    final BaseObserver userA = new UserObserver(chatChannel, "andrew");
    final BaseObserver userB = new UserObserver(chatChannel, "ala");
    final BaseObserver adminA = new AdminObserver(chatChannel, "john");
    final BaseObserver adminB = new AdminObserver(chatChannel, "ann");

    userA.sendMessage("Hello all");
    userB.sendMessage("Hi Andrew");
    adminA.sendMessage("ann they can't see what we write");
    adminB.sendMessage("Yes I know");
  }
}
