package org.example.pretecicprogram;

public class Java {
    public static int m1(int a, int b){
        return a-b;
    }
    public static String m2(String a, String b){
        return a+b;
    }

    public static void main(String[] args) {
        Java obj=new Java();
        System.out.println(m1(12,4));
        System.out.println(Java.m2("Ravi","Kant"));
    }
}
