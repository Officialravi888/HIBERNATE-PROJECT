package org.example.maltithreading;

public class Demo3 implements Runnable{
    @Override
    public void run() {
        System.out.println("call runnable");
    }
}
class Demo4 extends Thread{
    public void run(){
        //System.out.println("call thread");
        try {
            Thread.sleep(2009);
        }catch (Exception ex){
            System.out.println("call thread:"+ex);
        }
    }
}
class Test{
    public static void main(String[] args) {
        Demo3 obj=new Demo3();
        Demo4 obj2=new Demo4();
        Thread obj1=new Thread(obj);
        Thread obj11=new Thread(obj2);
        obj1.start();
        obj11.start();
    }
}
