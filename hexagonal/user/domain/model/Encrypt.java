package user.domain.model;

public class Encrypt {

  private String textToEncrypt;

  public Encrypt(String text) {
    this.textToEncrypt = text;
  }

  public String value() {
    return textToEncrypt;
  }

}
