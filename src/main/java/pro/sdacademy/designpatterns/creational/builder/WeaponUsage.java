package pro.sdacademy.designpatterns.creational.builder;

import java.util.List;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */
public class WeaponUsage {

  public static void main(String[] args) {
    final Weapon laserGun = new Weapon.Builder()
        .withDamage(123)
        .withName("LaserGun")
        .withPerks(List.of("Color:red"))
        .withDurability(50L)
        .build();
    System.out.println(laserGun);
  }
}
