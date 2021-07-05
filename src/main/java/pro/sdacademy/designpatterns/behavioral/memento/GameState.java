package pro.sdacademy.designpatterns.behavioral.memento;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GameState {

  private Integer health;
  private Integer mana;
  private List<String> items;

  @Override
  public String toString() {
    return "GameState{" +
        "health=" + health +
        ", mana=" + mana +
        ", items=" + items +
        "}\n";
  }

  public void heal() {
    health = 100;
  }

  public void takeDamage(final int damage) {
    health -= damage;
  }

  public void addItem(final String item) {
    items.add(item);
  }

  public void loseAllItems() {
    items.clear();
  }

  public void restoreFromSnapshot(final GameStateSnapshot snapshot) {
    health = snapshot.getHealth();
    mana = snapshot.getMana();
    items = List.copyOf(snapshot.getItems());
  }
}
