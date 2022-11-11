package user.domain.model;

import user.domain.portsin.DomainException;
import user.domain.portsin.User;
import user.domain.portsin.UserService;
import user.domain.portsout.EmailSender;
import user.domain.portsout.UserNameCatalog;
import user.domain.portsout.Users;

public class DefaultUserService implements UserService {

  private Users users;
  private EmailSender sender;
  private UserNameCatalog userNameCatalog;

  @Override
  public void createUser(User user) {

    if (userNameCatalog.exists(user.username())) {
      throw new DomainException("El usuario elegido ya existe");
    }

    var newUser =
        new DefaultUser(user.username(), user.password(), user.email());

    users.add(newUser.userName(), newUser.password(), newUser.email());

    sender.send(new String[] {user.email()}, "Su usuario ha sido creado",
        "Usuario creado!");
  }

}
