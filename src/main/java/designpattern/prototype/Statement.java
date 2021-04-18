package designpattern.prototype;

import java.util.List;

public class Statement implements Cloneable {

  private String sqlQuery;

  private List<String> params;

  private Record rec;

  public Statement(String sqlQuery, List<String> params, Record rec) {
    this.sqlQuery = sqlQuery;
    this.params = params;
    this.rec = rec;
  }

  public String getSqlQuery() {
    return sqlQuery;
  }

  public List<String> getParams() {
    return params;
  }

  public Record getRec() {
    return rec;
  }

  public Statement clone() {
    try {
      return (Statement) super.clone();
    }
    catch (CloneNotSupportedException cloneNotSupportedException) {
    }
    return null;
  }
}
