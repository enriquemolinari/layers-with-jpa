package user.service.impl;

import org.junit.jupiter.api.Test;
import user.service.api.User;

public class UserTest {

  @Test
  public void bla() {

    ClientUser u = new ClientUser(1L, "user1", "pwd1", new Token() {
      @Override
      public String value() {
        return "unTokenCualquiera";
      }
    });

    User u1 = u.toUser();
    System.out.println(u1.token());
  }

}
