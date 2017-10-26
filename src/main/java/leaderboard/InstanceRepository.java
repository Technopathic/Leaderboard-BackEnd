package leaderboard;

import org.springframework.data.repository.CrudRepository;

import leaderboard.instance;

public interface InstanceRepository extends CrudRepository<Instance, Long> {

  List<Instance> findByGameID(Integer gameID);
  List<Instance> findByUserID(Integer userID);
  List<Instance> findByActive(Integer gameID, Integer userID, Boolean active);
}
