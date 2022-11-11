package user.domain.model;

import java.util.Map;

public class DefaultUser {

  private Long id;
  private String username;
  private String password;
  private String email;

  public DefaultUser(String username, String password, String email) {
    this.id = new Uuid().value();
    this.username = username;
    this.password = new Encrypt(password).value();
    this.email = new Email(email).value();
  }

  public Map<String, Object> toMap() {
    return Map.of("name", this.username, "id", this.id);
  }

  public String userName() {
    return this.username;
  }

  public Long userId() {
    return this.id;
  }

  public String email() {
    return this.email;
  }

  public String password() {
    return this.password;
  }
}
