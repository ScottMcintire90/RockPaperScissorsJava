import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Random;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class RockPaperScissors {
  public static void main(String[] args) {
    staticFileLocation("/public");
    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, "templates/layout.vtl");
    }, new VelocityTemplateEngine());

    get("/oneplayer", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/oneplayer.vtl");
      return new ModelAndView(model, "templates/layout.vtl");
    }, new VelocityTemplateEngine());

    get("/twoplayer", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/twoplayer.vtl");
      return new ModelAndView(model, "templates/layout.vtl");
    }, new VelocityTemplateEngine());

    get("/detector2", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();

      String player1 = request.queryParams("player1");
      String player2 = RockPaperScissors.computerChooses();
      RockPaperScissors newGame = new RockPaperScissors();
      String win = newGame.checkWinner(player1, player2);

      model.put("player1",player1);
      model.put("player2",player2);
      model.put("win", win);

      model.put("template", "templates/detector2.vtl");
      return new ModelAndView(model, "templates/layout.vtl");
    }, new VelocityTemplateEngine());

    get("/detector", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();

      String player1 = request.queryParams("player1");
      String player2 = request.queryParams("player2");
      RockPaperScissors newGame = new RockPaperScissors();
      String win = newGame.checkWinner(player1, player2);

      model.put("player1",player1);
      model.put("player2",player2);
      model.put("win", win);

      model.put("template", "templates/detector.vtl");
      return new ModelAndView(model, "templates/layout.vtl");
    }, new VelocityTemplateEngine());
  }

  public static String computerChooses() {
    ArrayList<String> computerRandom = new ArrayList<String>();
    computerRandom.add("rock");
    computerRandom.add("scissors");
    computerRandom.add("paper");
    String randomResult = "";
    Random computer = new Random();
    randomResult = computerRandom.get(computer.nextInt(3));
    return randomResult;
  }

  public static String checkWinner(String player1, String player2) {

    String tieGame = "Tie Game";
    String winPlayer1 = "Player 1 Wins";
    String winPlayer2 = "Player 2 Wins";
    String outcome = "";

    if(player1.equals(player2)) {
      outcome = tieGame;
    } else if(player1.equals("rock") && player2.equals("scissors") || player1.equals("paper") && player2.equals("rock") || player1.equals("scissors") && player2.equals("paper")) {
      outcome = winPlayer1;
    } else if(player1.equals("rock") && player2 .equals("paper") || player1.equals("scissors") && player2.equals("rock") || player1.equals("paper") && player2.equals("scissors"))
    {
      outcome = winPlayer2;
    }
   return outcome;
  }
}
