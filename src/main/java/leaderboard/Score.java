package leaderboard;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Score {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)

  private Integer id;
  private Integer userID;
  private Integer gameID;
  private Integer scoreContent;
  private String created_at;
  private String updated_at;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getUserID() {
    return userID;
  }

  public void setUserID(Integer userID) {
    this.userID = userID;
  }

  public Integer getGameID() {
    return gameID;
  }

  public void setGameID(Integer gameID) {
    this.gameID = gameID;
  }

  public Integer scoreContent() {
    return scoreContent;
  }

  public void setScoreContent(Integer scoreContent) {
    this.scoreContent = scoreContent;
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
