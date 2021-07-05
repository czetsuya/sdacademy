package pro.sdacademy.designpatterns.behavioral.state;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */
public class StateUsage {

  public static void main(String[] args) {
    final ParkingTicketVendingMachine machine = new ParkingTicketVendingMachine();
    ParkingTicketVendingMachineState state = new StillNeedToPayState(machine);
    state.openMachineAndAddPrintingPaperPieces();
    state.pressPrintingButton();
    state.moveCreditCardToSensor();

    state = new PaidState(machine);
    state.moveCreditCardToSensor();
    state.openMachineAndAddPrintingPaperPieces();
    state.pressPrintingButton();
  }
}
