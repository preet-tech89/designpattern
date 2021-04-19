package designpattern.creational.abstractfactorymethod;

public class VisaPlatniumValidator implements Validator {

  @Override
  public boolean isValid(CreditCard creditCard) {
    return false;
  }

}
