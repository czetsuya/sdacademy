package pro.sdacademy.designpatterns.behavioral.chainofresponsibility;

import java.util.UUID;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */
public class AwsSignature implements Credentials {

  @Override
  public String getCredentials(final String userId) {
    return UUID.randomUUID().toString(); // dummy implementation
  }
}
