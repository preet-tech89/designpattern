package designpattern.structural.adapter;

public class EmployeeLdap {

  private String cn;

  private String givenName;

  private String surName;

  private String mail;

  public EmployeeLdap(String cn, String givenName, String surName, String mail) {
    this.cn = cn;
    this.givenName = givenName;
    this.surName = surName;
    this.mail = mail;
  }

  public String getCn() {
    return cn;
  }

  public String getGivenName() {
    return givenName;
  }

  public String getSurName() {
    return surName;
  }

  public String getMail() {
    return mail;
  }
}
