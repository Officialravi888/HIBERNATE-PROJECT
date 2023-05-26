package org.example.checkedexception;

public class ClassNotFound {
  public static void main(String[] args) {
    try {
      Class.forName("fi.txt");
    }catch (ClassNotFoundException ex){
      System.out.println("ex");
    }
  }
}