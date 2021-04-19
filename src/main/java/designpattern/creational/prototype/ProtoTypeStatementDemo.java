package designpattern.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class ProtoTypeStatementDemo {

  public static void main(String[] args) {
    final String query = "select * from employee where name = ?";
    final List<String> params = new ArrayList<>();
    params.add("gp");

    final Record rec = new Record();

    final Statement statemnt = new Statement(query, params, rec);

    System.out.println(statemnt.getSqlQuery());
    System.out.println(statemnt.getParams());
    System.out.println(statemnt.getRec());

    final Statement anotherStatment = statemnt.clone();

    System.out.println(anotherStatment.getSqlQuery());
    System.out.println(anotherStatment.getParams());
    System.out.println(anotherStatment.getRec());
  }
}
