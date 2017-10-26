package leaderboard;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)

  private Integer id;
  private String name;
  private String email;
  private String created_at;
  private String updated_at;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
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
