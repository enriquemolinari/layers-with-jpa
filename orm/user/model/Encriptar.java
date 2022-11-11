package user.model;

public class Encriptar {

  private String textToEncrypt;

  public Encriptar(String text) {
    this.textToEncrypt = text;
  }

  public String value() {
    return textToEncrypt;
  }

}
