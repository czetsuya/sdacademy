package pro.sdacademy.designpatterns.behavioral.mediator;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ActionAppliedMessage implements Component {

  private Mediator mediator;

  public void setMediator(final Mediator mediator) {
    this.mediator = mediator;
  }

  public void displayInfo() {
    log.info("Action was applied successfully");
  }

  @Override
  public void sendRequest() {
    mediator.sendInfo(this, "ActionAppliedMessage");
  }
}
