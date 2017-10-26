package instance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.security.core.Authentication;

import leaderboard.Instance;
import leaderboard.InstanceRepository;

@Controller
@RequestMapping(path="/instance")

public class InstanceController {
  @Autowired

  private InstanceRepository instanceRepository;

  @GetMapping(path="/store")
  public @ResponseBody String storeInstance (Authentication authentication, @RequestParam Integer gameID)
  {
    String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
    Integer userID = authentication.getId();
    Integer active = 1;

    Instance instance = new Instance();
    instance.setUserID(userID);
    instance.setGameID(gameID);
    instance.active(active);
    instance.setCreatedAt(timestamp);
    instance.setUpdatedAt(timestamp);
    instanceRepository.save(instance);

    return "Success";
  }

  @GetMapping(path="/update")
  public @ResponseBody String updateInstance (Authentication authentication, @RequestParam Integer gameID)
  {
    String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
    Integer userID = authentication.getId();

    Instance instance = repository.findByActive(userID, gameID, 1);
    if (instance != null)
    {
      Integer active = 1;

      instance.active(active);
      instance.setUpdatedAt(timestamp);
      instanceRepository.save(instance);

      return "Instance Updated";
    }
    else {
      return "Instance Not Found";
    }
  }
}
