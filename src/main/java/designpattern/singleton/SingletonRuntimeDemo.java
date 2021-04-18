package designpattern.singleton;

public class SingletonRuntimeDemo {

  public static void main(String[] args) {
    final Runtime singletonRuntime = Runtime.getRuntime();
    
    System.out.println(singletonRuntime);
    
    singletonRuntime.gc();
    
    final Runtime anotherSingletonRuntime = Runtime.getRuntime();
    
    System.out.println(anotherSingletonRuntime);
    
    if(singletonRuntime == anotherSingletonRuntime) {
      System.out.println("Equal instance of runtime");
    }
  }

}
