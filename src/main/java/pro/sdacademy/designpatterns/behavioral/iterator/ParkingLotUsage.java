package pro.sdacademy.designpatterns.behavioral.iterator;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */

import java.util.Iterator;

public class ParkingLotUsage {

  public static void main(String[] args) {
    final ParkingLot parkingLot = new ParkingLot();

    for (int idx = 0; idx < 12; idx++) {
      parkingLot.add(new SimpleCar());
    }

    final Iterator<Car> iterator = parkingLot.iterator();
    while (iterator.hasNext()) {
      final Car car = iterator.next();
      System.out.println(car);
    }
  }
}
