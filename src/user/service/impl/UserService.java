package user.service.impl;

import user.service.api.User;
import user.service.api.UserRepository;

public class UserService implements user.service.api.UserService {

  private UserRepository repo;

  @Override
  public User authenticar(String userName, String password) {
    ClientUser u = repo.authenticate(userName, password);

    return u.toUser();
  }

}
