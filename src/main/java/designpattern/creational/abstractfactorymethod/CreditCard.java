package designpattern.creational.abstractfactorymethod;

public abstract class CreditCard {

  protected int cardNumberLength;

  protected int csvNumber;

  public int getCardNumberLength() {
    return cardNumberLength;
  }

  public void setCardNumberLength(int cardNumberLength) {
    this.cardNumberLength = cardNumberLength;
  }

  public int getCsvNumber() {
    return csvNumber;
  }

  public void setCsvNumber(int csvNumber) {
    this.csvNumber = csvNumber;
  }
}
