package designpattern.creational.builder;

public class EmployeeBeanDemo {

  public static void main(String[] args) {
    final EmployeeBean emp = new EmployeeBean();

    emp.setFirstName("GP");
    emp.setLastName("Singh");
    emp.setAddress("CA");
    emp.setDesignation("NA");

    System.out.println(emp.getFirstName());
    System.out.println(emp.getLastName());
    System.out.println(emp.getAddress());
    System.out.println(emp.getDesignation());

    final EmployeeBeanTelescope em = new EmployeeBeanTelescope("gp", "singh", "na", "ca");
    System.out.println(em.getFirstName());
    System.out.println(em.getLastName());
    System.out.println(em.getAddress());
    System.out.println(em.getDesignation());

    final EmployeeBeanBuilder.Builder builder = new EmployeeBeanBuilder.Builder();

    builder.firstName("gp_builder")
      .lastName("singh_builder")
      .address("ca_builder")
      .designation("na_builder");

    final EmployeeBeanBuilder empl = builder.build();

    System.out.println(empl.getFirstName());
    System.out.println(empl.getLastName());
    System.out.println(empl.getAddress());
    System.out.println(empl.getDesignation());

  }

}
