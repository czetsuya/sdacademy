package pro.sdacademy.designpatterns.behavioral.chainofresponsibility;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */
public class AwsAuthenticationHandler implements AuthenticationHandler {

  @Override
  public boolean authenticate(final Credentials credentials) {
    if (supports(credentials.getClass())) {
      return authenticateInAws(credentials);
    }
    return false;
  }

  @Override
  public boolean supports(final Class<?> clazz) {
    return clazz.equals(AwsSignature.class);
  }

  public boolean authenticateInAws(Credentials credentials) {
    return credentials.getCredentials("someUserId").length() == 5; // dummy implementation
  }
}
