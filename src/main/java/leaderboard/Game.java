package leaderboard;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Game {
  @Id
  @GeneratedValue(strategy=GengerationType.AUTO)

  private Integer id;
  private String gameName;
  private String created_at;
  private String updated_at;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getGameName() {
    return gameName;
  }

  public void setGameName(String gameName) {
    this.gameName = gameName;
  }

  public String getCreatedAt() {
    return created_at;
  }

  public String setCreatedAt() {
    this.created_at = created_at;
  }

  public String getUpdatedAt() {
    return updated_at;
  }

  public String setUpdatedAt() {
    this.updated_at = updated_at;
  }
}
