package designpattern.creational.abstractfactorymethod;

public class AmexPlatniumValidator implements Validator {

  @Override
  public boolean isValid(CreditCard creditCard) {
    return false;
  }

}
