package org.example.oops;

public class Runtimepolymarphism {
    public static void m1(){
        System.out.println("hello world!");
    }
    public static int m2(int a){
        return a;
    }
    public String s(String s){
        return s;
    }
    public void m1(int a, int b){
        System.out.println(a+":"+b);
    }

    public static void main(String[] args) {
        Runtimepolymarphism o=new Runtimepolymarphism();
        m1();
        System.out.println(m2(12));
        o.m1(12,43);
        System.out.println(o.s("java"));
    }

}
