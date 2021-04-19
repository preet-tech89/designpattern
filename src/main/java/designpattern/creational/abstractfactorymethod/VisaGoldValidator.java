package designpattern.creational.abstractfactorymethod;

public class VisaGoldValidator implements Validator {

  @Override
  public boolean isValid(CreditCard creditCard) {
    return false;
  }

}
