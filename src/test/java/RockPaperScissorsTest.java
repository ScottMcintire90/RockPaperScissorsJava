import org.junit.*;
import static org.junit.Assert.*;

public class RockPaperScissorsTest {
  //
  // @Test
  // public void checkWinner_rockTiesRock_tieGame() {
  //   RockPaperScissors testGame = new RockPaperScissors();
  //   String expected = "Tie Game";
  //   assertEquals(expected, testGame.checkWinner("rock", "rock"));
  // }
  // @Test
  // public void checkWinner_rockBeatsScissors_winPlayer1() {
  //   RockPaperScissors testGame = new RockPaperScissors();
  //   String expected = "Player 1 Wins";
  //   assertEquals(expected, testGame.checkWinner("rock", "scissors"));
  // }
  // @Test
  // public void checkWinner_rockLosesToPaper_winPlayer2() {
  //   RockPaperScissors testGame = new RockPaperScissors();
  //   String expected = "Player 2 Wins";
  //   assertEquals(expected, testGame.checkWinner("rock", "paper"));
  // }
  // @Test
  // public void checkWinner_scissorsWinsToPaper_winPlayer1() {
  //   RockPaperScissors testGame = new RockPaperScissors();
  //   String expected = "Player 1 Wins";
  //   assertEquals(expected, testGame.checkWinner("scissors", "paper"));
  // }
  // @Test
  // public void checkWinner_paperBeatsRock_winPlayer1() {
  //   RockPaperScissors testGame = new RockPaperScissors();
  //   String expected = "Player 1 Wins";
  //   assertEquals(expected, testGame.checkWinner("paper", "rock"));
  // }
  // @Test
  // public void checkWinner_paperLosesToScissors_winPlayer2() {
  //   RockPaperScissors testGame = new RockPaperScissors();
  //   String expected = "Player 2 Wins";
  //   assertEquals(expected, testGame.checkWinner("paper", "scissors"));
  // }
  @Test
  public void checkWinner_player1VersusComputer_winUnknown() {
    RockPaperScissors testGame = new RockPaperScissors();
    String expected = "Tie Game";
    assertEquals(expected, testGame.checkWinner("paper", "blank"));
  }
  // @Test
  // public void computerChooses_returnRandom_ResultUnknown() {
  //   RockPaperScissors testGame = new RockPaperScissors();
  //   String expected = "rock";
  //   assertEquals(expected, testGame.computerChooses("rock"));
  // }
}
