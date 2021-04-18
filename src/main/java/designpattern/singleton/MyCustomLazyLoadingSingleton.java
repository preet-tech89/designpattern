package designpattern.singleton;

//Singleton Class Lazy Loading example 
public class MyCustomLazyLoadingSingleton {

  private static MyCustomLazyLoadingSingleton instance; // Lazy Loading

  // So no other class can instantiate
  private MyCustomLazyLoadingSingleton() {
  }

  // Lazy Loading, and not thread safe.
  public static MyCustomLazyLoadingSingleton getInstance() {
    if(instance == null) {
        instance = new MyCustomLazyLoadingSingleton();
    }
    return instance;
  }

}
