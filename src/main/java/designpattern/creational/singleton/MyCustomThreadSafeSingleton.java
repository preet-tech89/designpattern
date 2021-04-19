package designpattern.creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.derby.jdbc.EmbeddedDriver;

//Singleton Class example 
public class MyCustomThreadSafeSingleton {

  // Volatile so that each thread in JVM can have one state of the instance.
  private static volatile MyCustomThreadSafeSingleton instance;

  private static volatile Connection conn;

  // So no other class can instantiate
  private MyCustomThreadSafeSingleton() {

    try {
      DriverManager.registerDriver(new EmbeddedDriver());
    }
    catch (SQLException exception) {
      System.out.println("Exception occurred " + exception.getMessage());
    }

    // Avoid object creation using reflections.
    if (conn != null) {
      throw new RuntimeException("Use getInstance method to instantiate instance for singleton class");
    }

    // Avoid object creation using reflections.
    if (instance != null) {
      throw new RuntimeException("Use getInstance method to instantiate instance for singleton class");
    }
  }

  // thread safe example basic example, double locking.
  public static MyCustomThreadSafeSingleton getInstance() {
    if (instance == null) {
      synchronized (MyCustomThreadSafeSingleton.class) {
        if (instance == null) {
          instance = new MyCustomThreadSafeSingleton();
        }
      }
    }
    return instance;
  }

  // thread safe example basic example, double locking.
  // Not static as we would get instance of the class first of singleton and get
  // connection.
  public Connection getConnection() {
    if (conn == null) {
      synchronized (MyCustomThreadSafeSingleton.class) {
        if (conn == null) {
          final String dbUrl = "jdbc:derby:memory:gp/gpdb;create=true";

          try {
            conn = DriverManager.getConnection(dbUrl);
          }
          catch (SQLException exception) {
            System.out.println("Exception occurred " + exception.getMessage());
          }
        }
      }
    }
    return conn;
  }

}
