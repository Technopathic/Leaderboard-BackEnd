package leaderboard;

import org.springframework.data.repository.CrudRepository;

import leaderboard.Game;

public interface GameRepository extends CrudRepository<Game, Long> {

}
