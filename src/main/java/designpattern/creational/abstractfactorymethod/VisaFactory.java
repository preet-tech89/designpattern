package designpattern.creational.abstractfactorymethod;

public class VisaFactory extends CreditCardFactory {

  @Override
  public CreditCard getCreditCard(CardType cardType) {
    switch (cardType) {
      case GOLD:
        return new VisaGoldCreditCard();
      case PLATNIUM:
        return new VisaPlatniumCreditCard();
      default:
        break;
    }
    return null;
  }

  @Override
  public Validator getValidator(CardType cardType) {
    switch (cardType) {
      case GOLD:
        return new VisaGoldValidator();
      case PLATNIUM:
        return new VisaPlatniumValidator();
      default:
        break;
    }
    return null;
  }

}
