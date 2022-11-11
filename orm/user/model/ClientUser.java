package user.model;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.management.relation.Role;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import user.domain.api.User;

@Entity
public class ClientUser {

  @Id
  private Long id;
  private String username;
  private String password;
  @Transient
  private transient Token t;

  @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  @JoinColumn(name = "id_user")
  private List<Role> roles;

  public ClientUser(Long id, String username, String password) {
    this(id, username, password, new Role[0]);
  }

  public ClientUser(Long id, String username, String password, Token t) {
    this(id, username, password, new Role[0]);
    this.t = t;
  }

  public ClientUser(Long id, String username, String password, Role... roles) {
    this.id = id;
    this.username = username;
    this.password = new Encriptar(password).value();
    this.roles = Arrays.<Role>asList(roles);
  }

  public User toUser() {
    return new User() {
      @Override
      public String userName() {
        return userName();
      }

      @Override
      public String token() {
        return generateToken();
      }
    };
  }

  public Map<String, Object> toMap() {
    return Map.of("roles", this.roles(), "name", this.username, "id", this.id);
  }

  private String roles() {
    return this.roles.stream().map((r) -> {
      return r.toString();
    }).collect(Collectors.joining(","));
  }

  public String name() {
    return this.username;
  }

  public Long userId() {
    return this.id;
  }

  // Below private methods are just for Hiberante

  protected ClientUser() {

  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String generateToken() {
    return t.value();
  }
}
