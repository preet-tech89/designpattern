package designpattern.structural.adapter;

public class EmployeeAdaptorLdap implements Employee {

  private EmployeeLdap instance;

  public EmployeeAdaptorLdap(EmployeeLdap instance) {
    this.instance = instance;
  }

  public String getId() {
    return instance.getCn();
  }

  public String getFirstName() {
    return instance.getGivenName();
  }

  public String getLastName() {
    return instance.getSurName();
  }

  public String getEmail() {
    return instance.getMail();
  }

  public String toString() {
    return "ID: " + instance.getCn() + " First Name: " + instance.getGivenName() + " Last Name: "
        + instance.getSurName() + " Email: " + instance.getMail();
  }
}
