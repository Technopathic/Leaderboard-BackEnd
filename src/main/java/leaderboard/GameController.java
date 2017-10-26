package leaderboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import leaderboard.Game;
import leaderboard.GameRepository;

@Controller
@RequestMapping(path="/game")

public class GameController {
  @Autowired

  private GameRepository gameRepository;

  @GetMapping(path="/store")
  public @ResponseBody String storeGame (@RequestParam String gameName)
  {
    String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());

    Game game = new Game();
    game.setGameName(gameName);
    game.setCreatedAt(timestamp);
    game.setUpdatedAt(timestamp);
    gameRepository.save(game);

    return "Success";
  }
}
