package pro.sdacademy.designpatterns.behavioral.chainofresponsibility;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */
public interface AuthenticationHandler {

  boolean authenticate(Credentials credentials);

  boolean supports(Class<?> clazz);
}
