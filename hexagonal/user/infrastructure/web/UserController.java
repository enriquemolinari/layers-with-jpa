package user.infrastructure.web;

import java.util.Map;
import user.domain.portsin.User;
import user.domain.portsin.UserService;

public class UserController {

  private UserService userService;

  public void newUser(Map<String, String> request) {

    User user = new User() {

      @Override
      public String username() {
        return request.get("username");
      }

      @Override
      public String password() {
        return request.get("password");
      }

      @Override
      public String email() {
        return request.get("email");
      }
    };

    this.userService.createUser(user);

  }
}
