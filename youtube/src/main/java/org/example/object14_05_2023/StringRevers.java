package org.example.object14_05_2023;

public class StringRevers {
    public static String revers(String str){
        return new StringBuffer(str).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(revers("PROGRAM"));
    }
}
