package pro.sdacademy.designpatterns.behavioral.state;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */
public enum MoneyMachineState {
  NO_PAPER,
  NEED_PAYMENT,
  PAID_READY_TO_PRINT,
  UNAVAILABLE
}
