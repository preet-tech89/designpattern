package designpattern.builder;


public class BuilderStringDemo {

  public static void main(String[] args) {
    final StringBuilder sb = new StringBuilder();
    
    sb.append("Name is Gp ");
    sb.append("and printing with example of builder pattern. ");
    sb.append("Can invoke append multiple times and append any type like no ");
    sb.append(89);
    
    System.out.println(sb.toString());
  }

}
