package org.example.checkedexception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFound {
    public static void main(String[] args) {
        BufferedReader br=null;
      try {
          br=new BufferedReader(new FileReader("f1.txt"));
        String data=null;
        while ((data=br.readLine())!=null) {
            System.out.println(data);
        }
        }catch (IOException ex){
          ex.printStackTrace();
      }finally {
          try {
              if (br!=null){
                  br.close();
              }
          }catch (IOException ex1){
ex1.printStackTrace();
          }
      }
    }
}
