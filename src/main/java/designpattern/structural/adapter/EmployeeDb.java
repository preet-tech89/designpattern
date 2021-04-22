package designpattern.structural.adapter;

public class EmployeeDb implements Employee {

  private String id;

  private String firstName;

  private String lastName;

  private String email;

  public EmployeeDb(String id, String firstName, String lastName, String email) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
  }

  public String getId() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getEmail() {
    return email;
  }

  public String toString() {
    return "ID: " + this.id + " First Name: " + this.firstName + " Last Name: " + this.lastName + " Email: "
        + this.email;
  }

}
