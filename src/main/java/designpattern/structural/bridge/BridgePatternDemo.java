package designpattern.structural.bridge;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.derby.jdbc.EmbeddedDriver;

public class BridgePatternDemo {

  public static void main(String[] args) {
    
    try {
      //JDBC is API
      DriverManager.registerDriver(new EmbeddedDriver()); // Driver
      
      final String jdbcUrl = "jdbc:derby:memory:codegp/webdb;create=true";
      
      final Connection conn = DriverManager.getConnection(jdbcUrl);
      
      final Statement statmnt = conn.createStatement();
      
      //Below client is abstration and can work with any DB that has driver.
      statmnt.executeUpdate("CREATE TABLE GP (ID INT, Street VARCHAR(20))");
      
      System.out.println("GP Table created");
    }
    catch (SQLException sqlException) {
    }
  }

}
