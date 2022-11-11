package user.domain.service;

import user.data.api.UserRepository;
import user.domain.api.User;
import user.model.ClientUser;

// si usas Spring para DI, esta clase puede ser privada
// Spring la inyecta igual
public class UserService implements user.domain.api.UserService {

  private UserRepository repo;

  @Override
  public User authenticar(String userName, String password) {
    ClientUser u = repo.authenticate(userName, password);

    return u.toUser();
  }

}
