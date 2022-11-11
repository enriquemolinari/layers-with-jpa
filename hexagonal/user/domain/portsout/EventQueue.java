package user.domain.portsout;

public interface EventQueue {

  void publish(String type, String value);
}
