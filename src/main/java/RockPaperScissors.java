import java.util.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Random;
// import spark.ModelAndView;
// import spark.template.velocity.VelocityTemplateEngine;
// import static spark.Spark.*;

public class RockPaperScissors {
  public static void main(String[] args) {
    // get("/", (request, response) -> {
    //   Map<String, Object> model = new HashMap<String, Object>();
    //   model.put("template", "templates/home.vtl");
    //   return new ModelAndView(model, "templates/layout.vtl");
    // }, new VelocityTemplateEngine());
    //
    // get("/detector", (request, response) -> {
    //   Map<String, Object> model = new HashMap<String, Object>();
    //
    //   String userInput = request.queryParams("");
    //   NumbersToWords newNumbers = new NumbersToWords();
    //   String convertedNumber = newNumbers.integerConverter(userInput);
    //   model.put("convertedNumber", convertedNumber);
    //
    //   model.put("template", "templates/detector.vtl");
    //   return new ModelAndView(model, "templates/layout.vtl");
    // }, new VelocityTemplateEngine());
  }

String randomResult = "";
  public String computerChooses(String computerChoice) {
    ArrayList<String> computerRandom = new ArrayList<String>();
    computerRandom.add("rock");
    computerRandom.add("scissors");
    computerRandom.add("paper");
    Random computer = new Random();
    randomResult = computerRandom.get(computer.nextInt(3));
    return randomResult;

  }
  // String computerPlayer = computerChooses();
  // public static String playerChoice(String gameType) {
  //   String onePlayerGame = computerChooses();
  //   String twoPlayerGame = checkWinner();
  //   if (gameType == onePlayer) {

  //     return onePlayerGame;
  //   } else {
  //     return twoPlayerGame;
  //   }
  //
  // }



  public static String checkWinner(String player1, String player2) {
    // player2 = "";
    // computerChooses(player2);
    String tieGame = "Tie Game";
    String winPlayer1 = "Player 1 Wins";
    String winPlayer2 = "Player 2 Wins";
    String outcome = "";

    if(player1.equals(player2)) {
      outcome = tieGame;
    } else if(player1 == "rock" && player2 == "scissors" || player1 == "paper" && player2 == "rock" || player1 == "scissors" && player2 == "paper") {
      outcome = winPlayer1;
    } else if(player1 == "rock" && player2 == "paper" || player1 == "scissors" && player2 == "rock" || player1 == "paper" && player2 == "scissors"){
      outcome = winPlayer2;
    }
   return outcome;
  }
}
