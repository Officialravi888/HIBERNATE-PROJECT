package org.example.exe;

public class StringChar {
    public static void main(String[] args) {
        String str="Java",b="";
        char ab;
        for (int i=0; i<str.length(); i++) {
            ab = str.charAt(i);
            b =ab + b;
        }
            System.out.println(":"+b);
    }
}
