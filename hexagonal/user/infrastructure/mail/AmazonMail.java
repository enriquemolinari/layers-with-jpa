package user.infrastructure.mail;

import user.domain.portsout.EmailSender;

public class AmazonMail implements EmailSender {

  public AmazonMail() {
    // Injectar aca servicios de AWS para envio de email
  }

  @Override
  public void send(String[] destination, String body, String title) {
    // TODO Auto-generated method stub

  }

}
