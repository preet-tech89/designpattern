package designpattern.builder;

public class EmployeeBeanBuilder {

  private final String firstName;

  private final String lastName;

  private final String designation;

  private final String address;

  private EmployeeBeanBuilder(Builder builder) {
    this.firstName = builder.firstName;
    this.lastName = builder.lastName;
    this.designation = builder.designation;
    this.address = builder.address;
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

  public static class Builder {

    private String firstName;

    private String lastName;

    private String designation;

    private String address;

    public Builder() { // pass args if to force any var to be mandatory

    }

    public Builder firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    public Builder lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    public Builder designation(String designation) {
      this.designation = designation;
      return this;
    }

    public Builder address(String address) {
      this.address = address;
      return this;
    }

    public EmployeeBeanBuilder build() {
      return new EmployeeBeanBuilder(this);
    }
  }
}
