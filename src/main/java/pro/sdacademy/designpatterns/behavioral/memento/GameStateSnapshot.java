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
public class GameStateSnapshot {

  private Integer health;
  private Integer mana;
  private List<String> items;

  public GameStateSnapshot(final GameState gameState) {
    this.health = gameState.getHealth();
    this.mana = gameState.getMana();
    this.items = List.copyOf(gameState.getItems()); // deep copy!
  }
}
