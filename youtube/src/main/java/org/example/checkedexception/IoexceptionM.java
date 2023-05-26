package org.example.checkedexception;

import java.io.FileInputStream;
import java.io.IOException;

public class IoexceptionM {
    public static void main(String[] args) {
       try {
           FileInputStream a=new FileInputStream("f1.txt");
           System.out.println(a);
       }catch (IOException ex){
           System.out.println(ex);
       }
    }
}
