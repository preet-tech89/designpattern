package designpattern.creational.abstractfactorymethod;

public class AmexGoldValidator implements Validator {

  @Override
  public boolean isValid(CreditCard creditCard) {
    return false;
  }

}
