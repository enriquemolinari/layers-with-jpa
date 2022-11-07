package user.service.api;

import user.service.impl.ClientUser;

public interface UserRepository {

  ClientUser authenticate(String userName, String password);

}
