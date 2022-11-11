package user.domain.api;

public interface UserService {

  User authenticar(String userName, String password);
}
