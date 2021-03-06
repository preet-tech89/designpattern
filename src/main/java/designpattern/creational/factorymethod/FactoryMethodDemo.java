package designpattern.creational.factorymethod;

import java.util.Calendar;

public class FactoryMethodDemo {

  public static void main(String[] args) {
    Calendar cal = Calendar.getInstance();
    
    System.out.println(cal);
    
    System.out.println(cal.get(Calendar.DAY_OF_MONTH));
    
    Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);
    
    System.out.println(site.getPages());
    
    site = WebsiteFactory.getWebsite(WebsiteType.SHOP);
    
    System.out.println(site.getPages());

  }

}
