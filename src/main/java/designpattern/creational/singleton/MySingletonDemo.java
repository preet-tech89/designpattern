package designpattern.creational.singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

//Demo class
public class MySingletonDemo {

  public static void main(String[] args) {
    final MyCustomSingleton instance = MyCustomSingleton.getInstance();

    // This would give compiler error
    // Singleton newInstance = new Singleton();

    System.out.println(instance);

    final MyCustomSingleton anotherInstance = MyCustomSingleton.getInstance();

    System.out.println(anotherInstance);

    // Lazy Loading
    final MyCustomLazyLoadingSingleton lazyLoadingInstance = MyCustomLazyLoadingSingleton.getInstance();

    System.out.println(lazyLoadingInstance);

    final MyCustomLazyLoadingSingleton anotherLazyLoadingInstance = MyCustomLazyLoadingSingleton.getInstance();

    System.out.println(anotherLazyLoadingInstance);

    // Thread Safe Demo
    final MyCustomThreadSafeSingleton threadSafeInstance = MyCustomThreadSafeSingleton.getInstance();

    // System.out.println(threadSafeInstance);

    // final MyCustomThreadSafeSingleton anotherThreadSafeInstance =
    // MyCustomThreadSafeSingleton.getInstance();

    // System.out.println(anotherThreadSafeInstance);
    long timeBefore = 0;
    long timeAfter = 0;
    System.out.println(threadSafeInstance);

    timeBefore = System.currentTimeMillis();
    Connection conn = threadSafeInstance.getConnection();
    timeAfter = System.currentTimeMillis();
    
    System.out.println("Intial Time " + (timeAfter - timeBefore));

    Statement statement;

    try {
      statement = conn.createStatement();
      statement.executeUpdate("CREATE TABLE GP(ID INT, NAME VARCHAR(10))");
      System.out.println("Table created");
      statement.close();
    }
    catch (SQLException sqlException) {
    }
    
    timeBefore = System.currentTimeMillis();
    conn = threadSafeInstance.getConnection();
    timeAfter = System.currentTimeMillis();
    
    System.out.println("After Time " + (timeAfter - timeBefore));

  }

}
