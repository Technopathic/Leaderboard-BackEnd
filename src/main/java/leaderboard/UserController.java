package leaderboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import leaderboard.User;
import leaderboard.UserRepository;

@Controller
@RequestMapping(path="/user")

public class UserController {
  @Autowired

  private UserRepository userRepository;

  @GetMapping(path="/store")
  public @ResponseBody String storeUser (@RequestParam String name, @RequestParam String email)
  {

    String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());

    User user = new User();
    user.setName(name);
    user.setEmail(email);
    user.setCreatedAt(timestamp);
    user.setUpdatedAt(timestamp);
    userRepository.save(user);

    return "Success";
  }

  @GetMapping(path="/get")
  public @ResponseBody Iterable<User> getUsers() {
    return userRepository.findAll();
  }
}
