package designpattern.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
  
  public List<Employee> getEmployeeList() {
    final List<Employee> employees = new ArrayList<>();
    
    final Employee employeeFrmDb = new EmployeeDb("123", "gp", "singh", "gp@matota.com");
    
    employees.add(employeeFrmDb);
    
    final EmployeeLdap empLdap = new EmployeeLdap("456", "gp", "singh", "gp@matota.com");
    
    employees.add(new EmployeeAdaptorLdap(empLdap));
    
    final EmployeeCSV empCsv = new EmployeeCSV("789,gp,singh,gp@matota.com");
    
    employees.add(new EmployeeAdaptorCSV(empCsv));
    
    return employees;
  }
 
}
