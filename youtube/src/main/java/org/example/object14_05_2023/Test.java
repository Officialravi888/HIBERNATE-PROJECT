package org.example.object14_05_2023;

public class Test {
    public void m1(int a){
        System.out.println(":"+a);
    }
    public String s;
    Test(String s){
        this.s=s;
        System.out.println(""+s);
    }
    public static void main(String[] args) {
        Test obj=new Test("ravi");
        obj.m1(12);
    }
}
