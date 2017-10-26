package leaderboard;

import org.springframework.data.repository.CrudRepository;

import leaderboard.Score;

public interface ScoreRepository extends CrudRepository<Score, Long> {

    List<Score> findByUserID(Integer userID);
    List<Score> findByGameID(Integer gameID);
    List<Score> findByGameIDOrderByScoreContentDesc(Integer gameID);
}
