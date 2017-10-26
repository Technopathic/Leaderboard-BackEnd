package leaderboard;

import org.springframework.data.repository.CrudRepository;

import leaderboard.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
