package pro.sdacademy.designpatterns.behavioral.chainofresponsibility;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */
public class BearerToken implements Credentials {

  @Override
  public String getCredentials(final String userId) {
    return "1/mZ1edKKACtPAb7zGlwSzvs72PvhAbGmB8K1ZrGxpcNM"; // dummy implementation
  }
}