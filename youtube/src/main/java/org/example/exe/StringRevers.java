package org.example.exe;

public class StringRevers {
    public static String rever(String str){
        return new StringBuilder(str).reverse().toString();
    }
    public static void main(String[] args) {
        StringRevers s=new StringRevers();
        System.out.println(rever("Java"));
    }
}
