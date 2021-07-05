package pro.sdacademy.designpatterns.behavioral.chainofresponsibility;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */
public class UsernameAndPasswordCredentials implements Credentials {

  // dummy implementation -> load real user UnP in real implementation
  @Override
  public String getCredentials(final String userId) {
    return "andrzej:Andrzej_123";
  }
}