import org.junit.*;
import static org.junit.Assert.*;

public class RockPaperScissorsTest {

  @Test
public void checkWinner_rockTiesRock_true() {
  RockPaperScissors testGame = new RockPaperScissors();
  assertEquals(true, testGame.checkWinner("rock", "rock"));
  }
}
