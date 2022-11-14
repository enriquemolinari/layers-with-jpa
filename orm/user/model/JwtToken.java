package user.model;

public class JwtToken implements Token {

  private String secret;

  public JwtToken(String secret) {
    this.secret = secret;
  }

  @Override
  public String value(String username) {
    // use JWT library here...
    return null;
  }


}
