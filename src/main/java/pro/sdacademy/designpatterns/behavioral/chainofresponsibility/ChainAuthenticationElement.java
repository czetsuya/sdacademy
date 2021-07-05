package pro.sdacademy.designpatterns.behavioral.chainofresponsibility;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */

import static java.util.Objects.nonNull;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ChainAuthenticationElement {

  private final AuthenticationHandler authenticationHandler;
  private final ChainAuthenticationElement next;

  public ChainAuthenticationElement(final AuthenticationHandler authenticationHandler,
      final ChainAuthenticationElement next) {
    this.authenticationHandler = authenticationHandler;
    this.next = next;
  }

  public ChainAuthenticationElement(final AuthenticationHandler authenticationHandler) {
    this.authenticationHandler = authenticationHandler;
    this.next = null;
  }

  public boolean authenticate(final Credentials credentials) {
    final boolean authenticated = authenticationHandler.authenticate(credentials);
    if (authenticated) {
      log.info("Authentication using handler " + authenticationHandler.getClass().getSimpleName() + " is OK");
      return true;
    } else {
      log.info("Authentication using handler " + authenticationHandler.getClass().getSimpleName() + " is KO");
    }

    return nonNull(next) && next.authenticate(credentials);
  }
}
