package designpattern.structural.adapter;

public class EmployeeAdaptorCSV implements Employee {

  private EmployeeCSV instance;

  public EmployeeAdaptorCSV(EmployeeCSV instance) {
    this.instance = instance;
  }

  public String getId() {
    return instance.getId() + "";
  }

  public String getFirstName() {
    return instance.getFirstname();
  }

  public String getLastName() {
    return instance.getLastname();
  }

  public String getEmail() {
    return instance.getEmailAddress();
  }

  public String toString() {
    return "ID: " + instance.getId() + " First Name: " + instance.getFirstname() + " Last Name: "
        + instance.getLastname() + " Email: " + instance.getEmailAddress();
  }

}
