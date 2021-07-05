package pro.sdacademy.designpatterns.structural.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */
@Slf4j
public class CoffeePurchase implements DrinkPurchase {

  @Override
  public Drink buy(final Double cost) {
    log.info("Buying a a coffee for {}", cost);
    return new Coffee();
  }
}
