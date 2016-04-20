import org.junit.*;
import static org.junit.Assert.*;

public class RockPaperScissorsTest {

  @Test
  public void checkWinner_rockTiesRock_tieGame() {
    RockPaperScissors testGame = new RockPaperScissors();
    String expected = "Tie Game";
    assertEquals(expected, testGame.checkWinner("rock", "rock"));
  }
  @Test
  public void checkWinner_rockBeatsScissors_winPlayer1() {
    RockPaperScissors testGame = new RockPaperScissors();
    String expected = "Player 1 Wins";
    assertEquals(expected, testGame.checkWinner("rock", "scissors"));
  }
}
