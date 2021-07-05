package pro.sdacademy.designpatterns.behavioral.visitor;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */
public interface HTMLFile {

  String getDoctypeDeclaration();

  String getHead();

  String getBody();

  void accept(Visitor visitor);
}
