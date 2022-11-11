package user.data.api;

import user.model.ClientUser;

public interface UserRepository {

  ClientUser authenticate(String userName, String password);

}
