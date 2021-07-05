package pro.sdacademy.designpatterns.behavioral.state;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */
public interface ParkingTicketVendingMachineState {

  void moveCreditCardToSensor();

  void pressPrintingButton();

  void openMachineAndAddPrintingPaperPieces();
}
