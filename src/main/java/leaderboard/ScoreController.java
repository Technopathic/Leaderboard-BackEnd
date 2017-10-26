package leaderboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.security.core.Authentication;

import leaderboard.Score;
import leaderboard.ScoreRepository;

import leaderboard.Instance;
import leaderboard.InstanceRepository;

@Controller
@RequestMapping(path="/score")

public class ScoreController {
  @Autowired

  private ScoreRepository scoreRepository;

  @GetMapping(path="/store")
  public @ResponseBody String storeScore (Authentication authentication, @RequestParam Integer gameID, @RequestParam Integer scoreContent)
  {
    String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
    Integer userID = authentication.getId();

    Instance instance = repository.findByActive(userID, gameID, 1);
    if(instance != null)
    {
      score.setScoreContent(scoreContent);
      score.setUpdatedAt(timestamp);
      scoreRepository.save(score);

      return "Score Stored";
    }
    else {
      Score score = new Score();
      score.setUserID(userID);
      score.setGameID(gameID);
      score.setScoreContent(scoreContent);
      score.setCreatedAt(timestamp);
      score.setUpdatedAt(timestamp);
      scoreRepository.save(score);

      return "Score Updated";
    }
  }

  @GetMapping(path="/user")
  public @ResponseBody String showUserScore (@RequestParam Integer userID)
  {
    return scoreRepository.findByUserID(userID);
  }

  @GetMapping(path="/game")
  public @ResponseBody String showGameScore (@RequestParam Integer gameID)
  {
    return scoreRepository.findByGameID(gameID);
  }

  @GetMapping(path="/highScore")
  public @ResponseBody String showHighScore (@RequestParam Integer gameID)
  {
    return scoreRespository.sortByHighest(gameID);
  }

  @GetMapping(path="/get")
  public @ResponseBody Iterable<Score> getScores() {
    return scoreRepository.findAll();
  }
}
