package designpattern.prototype;


public class MyPrototypeDemo {

  public static void main(String[] args) {
    final Registry registry = new Registry();
    final Movie movie = (Movie) registry.createItem("Movie");
    movie.setTitle("Creational Design pattern");
    
    System.out.println(movie);
    System.out.println(movie.getRunTime());
    System.out.println(movie.getTitle());
    System.out.println(movie.getUrl());
    
    final Movie anotherMovie = (Movie) registry.createItem("Movie");
    movie.setTitle("Design pattern");
    
    System.out.println(anotherMovie);
    System.out.println(anotherMovie.getRunTime());
    System.out.println(anotherMovie.getTitle());
    System.out.println(anotherMovie.getUrl());
  }

}
