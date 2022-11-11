package user.domain.portsout;

public interface EmailSender {

  void send(String[] destination, String body, String title);
}
