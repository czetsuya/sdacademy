package pro.sdacademy.designpatterns.behavioral.interpreter;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */
public class InterpreterUsage {

  public static void main(String[] args) {

    String cmd = "2 + 3 * 2";

    final MathOperationApplier mathOperationApplier = new MathOperationApplier();
    Interpreter interpreter = new PythonStyleWithoutOrderMathOperationsInterpreter(mathOperationApplier);

    String result = interpreter.interpret(cmd);
    System.out.println(result);

//    cmd = "3 ADD 3 EXPONENTIATION 2";
//    interpreter = new WordsWithoutOrderMathOperationsInterpreter(mathOperationApplier);
//    result = interpreter.interpret(cmd);
//    System.out.println(result);
  }
}
