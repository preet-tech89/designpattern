package designpattern.creational.abstractfactorymethod;

import java.io.ByteArrayInputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

public class AbstractFactoryMethodDemo {

  public static void main(String[] args) throws Exception {
    final String xml = "<html><body><h1>Name is GP</h1></body></html>";

    final ByteArrayInputStream inputStream = new ByteArrayInputStream(xml.getBytes());

    DocumentBuilderFactory abstractFactory = DocumentBuilderFactory.newInstance();
    DocumentBuilder factory = abstractFactory.newDocumentBuilder();
    Document doc = factory.parse(inputStream);

    doc.getDocumentElement()
      .normalize();

    System.out.println("Root Element " + doc.getDocumentElement()
      .getNodeName());
    System.out.println(abstractFactory.getClass());
    System.out.println(factory.getClass());

    ////////////////////

    CreditCardFactory abstractCardFactory = CreditCardFactory.getCreditCardFactory(1000);

    CreditCard card = abstractCardFactory.getCreditCard(CardType.PLATNIUM);

    System.out.println(card.getClass());

    abstractCardFactory = CreditCardFactory.getCreditCardFactory(800);

    CreditCard anotherCard = abstractCardFactory.getCreditCard(CardType.GOLD);

    System.out.println(anotherCard.getClass());
  }

}
