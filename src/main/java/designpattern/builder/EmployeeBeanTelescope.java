package designpattern.builder;

//Immutable, no setter
public class EmployeeBeanTelescope {

  private String firstName;

  private String lastName;

  private String designation;

  private String address;

  public EmployeeBeanTelescope(String firstName) {
    this.firstName = firstName;
  }

  public EmployeeBeanTelescope(String firstName, String lastName) {
    this(firstName);
    this.lastName = lastName;
  }

  public EmployeeBeanTelescope(String firstName, String lastName, String designation) {
    this(firstName, lastName);
    this.designation = designation;
  }

  public EmployeeBeanTelescope(String firstName, String lastName, String designation, String address) {
    this(firstName, lastName, designation);
    this.address = address;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getDesignation() {
    return designation;
  }

  public String getAddress() {
    return address;
  }

}
