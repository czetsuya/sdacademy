package pro.sdacademy.designpatterns.behavioral.visitor;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */
public interface Visitor {

  void validateFile(HTML4File html4File);

  void validateFile(HTML5File html5File);

  void validateFile(XHTMLFile xhtmlFile);
}
