package designpattern.structural.adapter;

import java.util.Arrays;
import java.util.List;

public class AdaptorDemo {

  public static void main(String[] args) {
    final Integer[] intArray = new Integer[] {1,2,3};
    
    final List<Integer> listInt = Arrays.asList(intArray);
    
    System.out.println(intArray);
    
    System.out.println(listInt);
    
    System.out.println("----------------------------------------------");
    
    final EmployeeClient empClnt = new EmployeeClient();
    
    final List<Employee> employees = empClnt.getEmployeeList();
    
    System.out.println(employees);
  }

}
