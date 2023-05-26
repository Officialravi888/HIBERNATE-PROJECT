package org.example.maltithreading;

public class Demo2 implements Runnable{
    public void run(){
        System.out.println("call run method");
    }
    public String m(String m){
        return m;
    }

    public static void main(String[] args) {
        Demo2 obj=new Demo2();
        System.out.println(obj.m("java"));
        Thread obj1=new Thread(obj);
        obj1.start();
        obj1.getName();
    }
}
