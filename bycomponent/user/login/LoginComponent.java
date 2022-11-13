package user.login;

public interface LoginComponent {

  AuthUser login(String username, String password);

  void logout(String token);

}
