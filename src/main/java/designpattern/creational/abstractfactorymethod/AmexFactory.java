package designpattern.creational.abstractfactorymethod;

public class AmexFactory extends CreditCardFactory {

  @Override
  public CreditCard getCreditCard(CardType cardType) {
    switch (cardType) {
      case GOLD:
        return new AmexGoldCreditCard();
      case PLATNIUM:
        return new AmexPlatniumCreditCard();
      default:
        break;
    }
    return null;
  }

  @Override
  public Validator getValidator(CardType cardType) {
    switch (cardType) {
      case GOLD:
        return new AmexGoldValidator();
      case PLATNIUM:
        return new AmexPlatniumValidator();
      default:

    }
    return null;
  }
}
