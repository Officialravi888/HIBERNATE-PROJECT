package org.example.maltithreading;

public class Demo1 extends Thread{
    public void run(){
        System.out.println("print first method");
    }
    public static void main(String[]args){
        Demo1 obj=new Demo1();
        Thread obj1=new Thread(obj);
        obj.run();
        obj1.start();
    }
}
