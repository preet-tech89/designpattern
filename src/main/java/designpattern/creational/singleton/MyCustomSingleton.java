package designpattern.creational.singleton;

//Singleton Class Basic example 
public class MyCustomSingleton {

  private static MyCustomSingleton instance = new MyCustomSingleton(); // One instance of the class, eagerly loading

  // So no other class can instantiate
  private MyCustomSingleton() {
  }

  // eagerly Loading, and not thread safe.
  public static MyCustomSingleton getInstance() {
    return instance;
  }

}
