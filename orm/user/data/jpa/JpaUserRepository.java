package user.data.jpa;

import user.data.api.UserRepository;
import user.model.ClientUser;

public class JpaUserRepository implements UserRepository {

  public JpaUserRepository() {
    // Inyectar aca EntityManager
  }

  @Override
  public ClientUser authenticate(String userName, String password) {
    // TODO Auto-generated method stub
    return null;
  }

}
