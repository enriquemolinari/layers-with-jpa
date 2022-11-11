package user.infrastructure.rabbit;

import user.domain.portsout.EventQueue;

public class RabbitEventQueue implements EventQueue {

  public RabbitEventQueue() {
    // Injectar aca conexiones a Rabbit
  }

  @Override
  public void publish(String type, String value) {
    // TODO Auto-generated method stub

  }

}
