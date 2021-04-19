package designpattern.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

  private Map<String, Item> items = new HashMap<>();

  public Registry() {
    loadItems();
  }
  
  public Item createItem(String type) {
    Item item = null;
    try {
      item = (Item) (items.get(type)).clone();
    }
    catch (CloneNotSupportedException e) {
      // TODO: handle exception
    }
    return item;
  }

  private void loadItems() {
    final Movie movie = new Movie();
    movie.setTitle("qismat");
    movie.setPrice(25);
    movie.setRunTime("2 hours");
    items.put("Movie", movie);
    
    final Book book = new Book();
    book.setTitle("My Book");
    book.setNumberOfPages(200);
    book.setPrice(30);
    items.put("Book", book);
  }

}
